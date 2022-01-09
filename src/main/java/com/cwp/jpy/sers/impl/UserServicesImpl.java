package com.cwp.jpy.sers.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cwp.jpy.beans.AppConfigs;
import com.cwp.jpy.beans.BaseConstant;
import com.cwp.jpy.mapper.*;
import com.cwp.jpy.model.*;
import com.cwp.jpy.sers.UserServices;
import com.cwp.jpy.utils.ExportUtil;
import com.cwp.jpy.utils.MD5Utils;
import com.cwp.jpy.utils.ResponseUtil;
import com.cwp.jpy.utils.StringUtilEx;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

@Component
public class UserServicesImpl implements UserServices {
    private final static Logger log = LoggerFactory.getLogger(UserServicesImpl.class);
    private final static String salt = "Nh*72Uyhbaduio9";
    @Resource
    private JpyUserMapper jpyUserMapper;
    @Resource
    private JpySessionMapper jpySessionMapper;
    @Resource
    private JpyVerCodeMapper jpyVerCodeMapper;
    @Resource
    private JpyOrgMapper jpyOrgMapper;
    @Resource
    private JpyCountMapper jpyCountMapper;

    @Resource
    private JpyTaskMapper jpyTaskMapper;
    @Resource
    private JpyTransMapper jpyTransMapper;
    @Resource
    private AppConfigs appConfigs;
    @Resource
    private JpyUserMenuMapper jpyUserMenuMapper;

    @Resource
    private ExportUtil exportUtil;

    @Override
    public Object userLogin(JSONObject jsonObject) {
        JSONObject retJson = new JSONObject();
        String userPhone = jsonObject.getString("userphone");
        String userPasswd = jsonObject.getString("userpasswd");
        String verfiycode = jsonObject.getString("verfiycode");
        if(StringUtilEx.isNullOrEmpty(userPhone)){
            return ResponseUtil.retErro(retJson,"手机号不能为空！");
        }
        if(StringUtilEx.isNullOrEmpty(userPasswd)){
            return ResponseUtil.retErro(retJson,"密码不能为空！");
        }
        String reqip = jsonObject.getString("reqip");
        SimpleDateFormat sdf = new SimpleDateFormat(BaseConstant.sdf);
        JpyUser jpyUser = new JpyUser();
        jpyUser.setUserphone(userPhone);
        jpyUser.setUserstatus("1");//查询手机号激活状态的业务人员
        List<JpyUser> jpyUsers = jpyUserMapper.queryJpyUser(jpyUser);
        if(null!=jpyUsers && jpyUsers.size()>0){
            log.info("jpyUsers----{}",jpyUsers.get(0));
            JpyUser queryUser = jpyUsers.get(0);
            try {
                if(!StringUtilEx.isNullOrEmpty(verfiycode)){
                    //验证码不为空时先校验验证码
                    JpyVerCode jpyVerCode = new JpyVerCode();
                    jpyVerCode.setUserphone(queryUser.getUserphone());
                    jpyVerCode.setVercode(verfiycode.toLowerCase());
                    List<JpyVerCode> jpyVerCodes = jpyVerCodeMapper.queryJpyVerCode(jpyVerCode);
                    if(null!=jpyVerCodes && jpyVerCodes.size()>0){
                        log.info("------验证码正确----");
                    }else{
                        return ResponseUtil.retErro(retJson,"验证码错误！");
                    }
                }else{
                        return ResponseUtil.retErro(retJson,"验证码错误！");
                }
                //验证码校验通过 开始比对用户密码
                String inputpasswd = MD5Utils.digestMD5((userPasswd+salt).getBytes());
                log.info("inputpasswd-----{}",inputpasswd);
                if(inputpasswd.equals(queryUser.getUserpasswd())){
                    //密码正确
                    queryUser.setWrongnum("0");
                    queryUser.setLatesttime(sdf.format(new Date()));
                    queryUser.setLatestlogip(reqip);
                    int a = jpyUserMapper.updateJpyUser(queryUser);
                    log.info("-------updatejpyuser----{}",a);
                    List<Map<String, Object>> menus = jpyUserMapper.queryUserMenus(queryUser.getUserid().toString());
                    if(null!=menus && menus.size()>0){
                        log.info("----menusize----{}",menus.size());
                        for(int i =0 ;i<menus.size();i++){
                            Map<String,Object> m = menus.get(i);
                            List<Map<String, Object>> childrenmenulisst = new ArrayList<>();
                            m.put("children",childrenmenulisst);
                        }
                        retJson.put("user",queryUser);
                        retJson.put("menus", menus);
                        String session = MD5Utils.digestMD5((sdf.format(new Date())+
                                queryUser.toString()+salt).getBytes());
                        JpySession jpySession = new JpySession();
                        jpySession.setSession(session);
                        jpySession.setUserid(queryUser.getUserid());
                        jpySession.setSessionip(reqip);
                        jpySession.setTimer(sdf.format(new Date()));
                        jpySessionMapper.deleteUserSession(queryUser.getUserid());
                        jpySessionMapper.insertJpySession(jpySession);
                        retJson.put("token",session);
                    }else{
                        return ResponseUtil.retErro(retJson,"用户菜单配置错误！");
                    }
                }else{
                    //密码错误
                    String passwdnum = queryUser.getWrongnum();
                    if(StringUtilEx.isNullOrEmpty(passwdnum)){
                        passwdnum = "1";
                    }else{
                        passwdnum = Integer.valueOf(passwdnum)+1+"";
                    }
                    queryUser.setWrongnum(passwdnum);
                    if(Integer.valueOf(passwdnum)>3){
                        retJson.put("verfiycode","1");
                        queryUser.setUserstatus("2");
                    }
                    jpyUserMapper.updateJpyUser(queryUser);
                    return ResponseUtil.retErro(retJson,"密码错误！");
                }

            } catch (Exception e) {
                log.info("----密码转换异常----{}", e.toString());
                e.printStackTrace();
                return ResponseUtil.retErro(retJson,"发生异常！");
            }
        }else{
            return ResponseUtil.retErro(retJson,"请检查登录账户是否正确,是否被锁定！");
        }
        return ResponseUtil.retSuccess(retJson);
    }

    @Override
    public Object getVerPic(JSONObject jsonObject) {
        String userPhone = jsonObject.getString("userphone");
        JSONObject retJson = new JSONObject();
        if(StringUtilEx.isNullOrEmpty(userPhone)){
            return ResponseUtil.retErro(retJson,"请检查手机号！");
        }
        JpyUser jpyUser = new JpyUser();
        jpyUser.setUserphone(userPhone);
        jpyUser.setUserstatus("1");
        List<JpyUser> jpyUsers = jpyUserMapper.queryJpyUser(jpyUser);
        if(null!=jpyUsers && jpyUsers.size()>0){
            String base64 = genVerCodePic(userPhone);
            log.info("base64----{}",base64);
            retJson.put("base64", base64);
        }else{
            return ResponseUtil.retErro(retJson, "登录账号不存在！");
        }
        return ResponseUtil.retSuccess(retJson);
    }

    @Override
    public Object queryOrgInfo(JSONObject jsonObject) {
        int page = (Integer) jsonObject.get("pageNum");
        int pagesize = (Integer)jsonObject.get("pageSize");
        String bussinessname = jsonObject.getString("bussinessname");
        String bussphone = jsonObject.getString("bussphone");
        JpyOrg jpyOrg = new JpyOrg();
        if(!StringUtilEx.isNullOrEmpty(bussinessname)){
            jpyOrg.setBussinessname(bussinessname);
            log.info("bussinessname----"+bussinessname);
        }
        if(!StringUtilEx.isNullOrEmpty(bussphone)){
            jpyOrg.setBussphone(bussphone);
            log.info("bussphone----"+bussphone);
        }
        PageHelper.startPage(page, pagesize);
        List<JpyOrg> jpyOrgs = jpyOrgMapper.queryJpyOrg(jpyOrg);
        log.info("jpyorgs.size:{}",jpyOrgs.size());
        PageInfo<JpyOrg> pageInfo = new PageInfo<>(jpyOrgs);
        JSONObject retJson = new JSONObject();
        retJson.put("bussinesses", jpyOrgs);
        retJson.put("total",pageInfo.getTotal());

        return ResponseUtil.retSuccess(retJson);
    }

    @Override
    public Object optOrgInfo(JSONObject jsonObject) {
        JSONObject retJson = new JSONObject();
        String bussinessid = jsonObject.getString("bussinessid");
        SimpleDateFormat sdf = new SimpleDateFormat(BaseConstant.sdf);
        int a = 0;
        if(StringUtilEx.isNullOrEmpty(bussinessid)){
            log.info("insert new orginfo ------"+jsonObject.toJSONString());
            JpyOrg jpyOrg = JSON.toJavaObject(jsonObject,JpyOrg.class);
            JpyOrg queryJpyOrg = jpyOrgMapper.queryJpyOrgLimit1(jpyOrg);
            if(null!=queryJpyOrg){
                return ResponseUtil.retErro(retJson, "商户名已存在！");
            }
            try {
                String priKey = MD5Utils.digestMD5((jpyOrg.getBussinessname()+salt).getBytes());
                jpyOrg.setPrikey(priKey);
            } catch (Exception e) {
                e.printStackTrace();
            }
            jpyOrg.setAddtime(sdf.format(new Date()));
            JpyUser jpyUser = new JpyUser();
            jpyUser.setUsername(jpyOrg.getBussphone());
            a= jpyOrgMapper.insertJpyOrg(jpyOrg);
            jpyOrg = jpyOrgMapper.queryJpyOrgLimit1(jpyOrg);
            log.info("--insert jpyorg:{}",JSONObject.toJSONString(jpyOrg));
            JpyUser jpyUser1 = jpyUserMapper.queryJpyUserLimit1(jpyUser);
            if(null!=jpyUser1){
                return ResponseUtil.retErro(retJson, "用户名已存在！");
            }
            jpyUser.setUserphone(jpyOrg.getBussphone());
            jpyUser.setBussinessid(String.valueOf(jpyOrg.getBussinessid()));
            jpyUser.setAddtime(sdf.format(new Date()));
            jpyUser.setUserstatus("1");
            try {
                jpyUser.setUserpasswd(MD5Utils.digestMD5(("123456"+salt).getBytes()));
            } catch (Exception e) {
                e.printStackTrace();

            }
            int jpyuserin = jpyUserMapper.insertJpyUser(jpyUser);
            if(jpyuserin<1){
                return ResponseUtil.retErro(retJson, "新增失败！");
            }
            jpyUser1 = jpyUserMapper.queryJpyUserLimit1(jpyUser);
            log.info("-----新增用户成功： {}",JSONObject.toJSONString(jpyUser1));
            String menus = appConfigs.getDefaultmenu();
            String [] menuarry = menus.split(",");
            for(int i=0;i<menuarry.length;i++){
                JpyUserMenu jpyUserMenu = new JpyUserMenu();
                jpyUserMenu.setUserid(jpyUser1.getUserid());
                jpyUserMenu.setMenuid(Integer.valueOf(menuarry[i]));
                jpyUserMenu.setTimer(sdf.format(new Date()));
                jpyUserMenuMapper.insertJpyUserMenu(jpyUserMenu);
            }
        }else{
            log.info("update org ------{}",jsonObject.toJSONString());
            JpyOrg jpyOrg = JSON.toJavaObject(jsonObject,JpyOrg.class);
            a = jpyOrgMapper.updateJpyOrg(jpyOrg);
        }
        if(a>0){
            return ResponseUtil.retSuccess(retJson);
        }else{
            return ResponseUtil.retErro(retJson, "更新失败！");
        }
    }

    @Override
    public Object queryCountInfo(JSONObject jsonObject) {
        int page = (Integer) jsonObject.get("pageNum");
        int pagesize = (Integer)jsonObject.get("pageSize");
        JpyCount jpyCount = new JpyCount();
        PageHelper.startPage(page, pagesize);
        List<JpyCount> jpyCounts = jpyCountMapper.queryJpyCount(jpyCount);
        log.info("jpyCounts.size:{}",jpyCounts.size());
        PageInfo<JpyCount> pageInfo = new PageInfo<>(jpyCounts);
        JSONObject retJson = new JSONObject();
        retJson.put("jpyCounts", jpyCounts);
        retJson.put("total",pageInfo.getTotal());

        return ResponseUtil.retSuccess(retJson);
    }

    @Override
    public Object optCountInfo(JSONObject jsonObject) {
        JSONObject retJson = new JSONObject();
        String countid = jsonObject.getString("countid");
        SimpleDateFormat sdf = new SimpleDateFormat(BaseConstant.sdf);
        JpyCount jpyCount = JSON.toJavaObject(jsonObject,JpyCount.class);
        if(null!=jpyCount.getCountsts() && "1".equals(jpyCount.getCountsts())){
            JpyCount queryCount = new JpyCount();
            queryCount.setCountsts("1");
            List<JpyCount> jpyCounts = jpyCountMapper.queryJpyCount(queryCount);
            if(null!=jpyCounts && jpyCounts.size()>0){
                queryCount = jpyCounts.get(0);
                if(Integer.valueOf(countid) != queryCount.getCountid()){

                    return ResponseUtil.retErro(retJson,"只能有一个激活状态账户！");
                }
            }
        }
        int a = 0;
        if(StringUtilEx.isNullOrEmpty(countid)){
            log.info("----insert count---{}",jsonObject.toJSONString());
            a = jpyCountMapper.insertJpyCount(jpyCount);
        }else{
            log.info("----update count---{}");
            jpyCount.setCountuptime(sdf.format(new Date()));
            a = jpyCountMapper.updateJpyCount(jpyCount);
        }
        if(a>0){
            return ResponseUtil.retSuccess(retJson);
        }else{
            return ResponseUtil.retErro(retJson, "更新失败！");
        }
    }

    @Override
    public Object queryTaskInfo(JSONObject jsonObject) {
        String bussinessname = jsonObject.getString("bussinessname");
        String taskstatus = jsonObject.getString("payres");
        String headTellerid = jsonObject.getString("headTellerid");
        String exportFlag = jsonObject.getString("export");
        JpyUser jpyUser = new JpyUser();
        jpyUser.setUserid(Integer.valueOf(headTellerid));
        jpyUser = jpyUserMapper.queryJpyUserLimit1(jpyUser);
        JSONObject retJson = new JSONObject();
        Map<String,Object> queryParam = new HashMap<>();
        if(!StringUtilEx.isNullOrEmpty(bussinessname)){
            queryParam.put("bussinessname",bussinessname);
        }
        if(!StringUtilEx.isNullOrEmpty(taskstatus)){
            queryParam.put("payres",taskstatus);
        }
        if(!"1".equals(jpyUser.getBussinessid())){
            queryParam.put("bussinessid",jpyUser.getBussinessid());
        }
        if(null!=exportFlag && "1".equals(exportFlag)){
            log.info("----export excel-----");
            List<Map<String,Object>> exporlist = jpyTaskMapper.queryJpys(queryParam);
            String [] title = new String[]{
              "商户名称","订单号","客户支付金额","到账时间","订单状态","结算状态","结算日期","结算批次"
            };
            String [] keys = new String[]{"bussinessname","tradeNo","tradenum","payrettime","payres",
            "transstatus","trantime","transno"};
            Map<String, Object> code = new HashMap<>();
            Map<String,Object> payresMap = new HashMap<>();
            payresMap.put("0","未支付");
            payresMap.put("1","已支付");
            code.put("payres",payresMap);
            Map<String,Object> transstatus = new HashMap<>();
            transstatus.put("1","未结算");
            transstatus.put("2","结算中");
            transstatus.put("3","已结算");
            code.put("transstatus",transstatus);
            String filename = exportUtil.getHSSFWorkbook(title, keys, "订单导出",
                    null,exporlist,code);
            String retfileName = appConfigs.getHost()+"/jpysers/downloadFile?filename="+filename;
            log.info("---filename->:{}",retfileName);
            retJson.put("filename",retfileName);
            return ResponseUtil.retSuccess(retJson);
        }
        int page = (Integer) jsonObject.get("pageNum");
        int pagesize = (Integer)jsonObject.get("pageSize");


        List<Map<String,Object>> tableHeaderList = jpyTaskMapper.cacJpysByStatus(queryParam);
        retJson.put("totalpay","0");
        retJson.put("paysuc","0");
        retJson.put("payfai","0");
        retJson.put("jsnum","0");
        if(null != tableHeaderList && tableHeaderList.size()>0 ){
            Map<String, Object> item = tableHeaderList.get(0);
            log.info("------item---{}",item);

            retJson.putAll(item);
        }

        PageHelper.startPage(page, pagesize);
        List<Map<String,Object>> taskList = jpyTaskMapper.queryJpys(queryParam);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(taskList);
        retJson.put("list",taskList);
        retJson.put("total",pageInfo.getTotal());
        return ResponseUtil.retSuccess(retJson);
    }

    @Override
    public Object querTransInfo(JSONObject jsonObject) {
        JSONObject retJson = new JSONObject();
        String bussiname = jsonObject.getString("bussiname");
        String payres = jsonObject.getString("payres");
        String exportFlag = jsonObject.getString("export");
        Map<String,Object> queryMap = new HashMap<>();
        if(!StringUtilEx.isNullOrEmpty(bussiname)){
            queryMap.put("bussinessname",bussiname);
        }
        if(!StringUtilEx.isNullOrEmpty(payres)){
            queryMap.put("payres",payres);
        }
        if(null!=exportFlag && "1".equals(exportFlag)){
            log.info("----export excel-----");
            List<Map<String,Object>> exporlist = jpyTransMapper.queryJpyTransRetMap(queryMap);
            String [] title = new String[]{
                    "商户名称","到账时间","商户费率（%）","渠道费率（%）",
                    "交易金额","利润","结算金额"
            };
            String [] keys = new String[]{"bussinessname","tradegentime","bussinessratio","countratio","trannum",
                    "transprofit","transnum" };
            Map<String, Object> code = new HashMap<>();
            Map<String,Object> transstatus = new HashMap<>();
            transstatus.put("1","未结算");
            transstatus.put("2","结算中");
            transstatus.put("3","已结算");
            code.put("transstatus",transstatus);
            String filename = exportUtil.getHSSFWorkbook(title, keys, "订单查询导出",
                    null,exporlist,code);
            String retfileName = appConfigs.getHost()+"/jpysers/downloadFile?filename="+filename;
            log.info("---filename->:{}",retfileName);
            retJson.put("filename",retfileName);
            return ResponseUtil.retSuccess(retJson);
        }
        int page = (Integer) jsonObject.get("pageNum");
        int pagesize = (Integer)jsonObject.get("pageSize");

        Map<String, Object> queryParam = new HashMap<>();
        List<Map<String,Object>> tableHeaderList = jpyTaskMapper.cacJpysByStatus(queryParam);
        retJson.put("totalpay","0");
        retJson.put("paysuc","0");
        retJson.put("payfai","0");
        retJson.put("jsnum","0");
        if(null != tableHeaderList && tableHeaderList.size()>0 ){
            Map<String, Object> item = tableHeaderList.get(0);
            log.info("------item---{}",item);

            retJson.putAll(item);
        }
        PageHelper.startPage(page, pagesize);
        List<JpyTaskTrans> jpyTrans1 = jpyTransMapper.queryJpyTaskTran(queryMap);
        PageInfo<JpyTaskTrans> pageInfo = new PageInfo<>(jpyTrans1);
        retJson.put("list",jpyTrans1);
        retJson.put("total",pageInfo.getTotal());
        return ResponseUtil.retSuccess(retJson);
    }

    @Override
    public Object restPasswd(JSONObject jsonObject) {
        JSONObject ret = new JSONObject();
        JpyUser jpyUser = JSON.toJavaObject(jsonObject,JpyUser.class);
        SimpleDateFormat sdf = new SimpleDateFormat(BaseConstant.sdf);
        jpyUser.setLatesttime(sdf.format(new Date()));
        try {
            jpyUser.setUserpasswd(MD5Utils.digestMD5(("123456"+salt).getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        int a = jpyUserMapper.updateJpyUser(jpyUser);
        if(a<1){
            return ResponseUtil.retErro(ret, "重置密码失败");
        }

        return ResponseUtil.retSuccess(ret);
    }

    @Override
    public Object chgPasswd(JSONObject jsonObject) {
        String userid = jsonObject.getString("userid");
        String oldpasswd = jsonObject.getString("oldpasswd");
        String newpasswd = jsonObject.getString("newpasswd");
        JpyUser jpyUser = new JpyUser();
        jpyUser.setUserid(Integer.valueOf(userid));
        JSONObject retJson = new JSONObject();
        if(newpasswd.length()<8){
            return ResponseUtil.retErro(retJson, "新密码至少8位！");
        }
        try {
            jpyUser.setUserpasswd(MD5Utils.digestMD5((oldpasswd+salt).getBytes()));
            JpyUser queryuser = jpyUserMapper.queryJpyUserLimit1(jpyUser);
            if(null!=queryuser){
                queryuser.setUserpasswd(MD5Utils.digestMD5((newpasswd+salt).getBytes()));
                int a = jpyUserMapper.updateJpyUser(queryuser);
                if(a<1){
                    return ResponseUtil.retErro(retJson, "修改密码失败！");
                }
            }else{
                return ResponseUtil.retErro(retJson, "密码输入错误！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseUtil.retErro(retJson, "密码修改异常！");
        }
        return ResponseUtil.retSuccess(retJson);
    }

    @Override
    public Object userExit(JSONObject jsonObject) {
        String userid = jsonObject.getString("userid");
        jpySessionMapper.deleteUserSession(Integer.valueOf(userid));
        return ResponseUtil.retSuccess(new JSONObject());
    }

    public String genVerCodePic(String uerphone){
        String ret = "";
        SimpleDateFormat sdf = new SimpleDateFormat(BaseConstant.sdf);
        try {
            String vercode = getRandomNumber();
            JpyVerCode jpyVerCode = new JpyVerCode();
            jpyVerCode.setUserphone(uerphone);
            List<JpyVerCode> jpyVerCodes = jpyVerCodeMapper.queryJpyVerCode(jpyVerCode);
            jpyVerCode.setVercode(vercode);
            jpyVerCode.setTimer(sdf.format(new Date()));
            if(null!=jpyVerCodes && jpyVerCodes.size()>0){
                jpyVerCodeMapper.updateJpyVerCode(jpyVerCode);
            }else{
                jpyVerCodeMapper.insertJpyVerCode(jpyVerCode);
            }
            log.info("------userphone :{}----vercode;:{}",uerphone,vercode);
            ret = createImg(vercode);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("-------exception ----- {}", e.toString());
        }
        return ret;
    }

    public String getRandomNumber() throws Exception{
        String code = "";
        int codeLength = 4;
        String[] randomCode = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for(int i = 0;i<codeLength;i++){
            int index = (int) Math.floor(Math.random()*36);
            code += randomCode[index];
        }
        return code;
    }
    /**
     * 生成图片base64
     * @param IDENTIFYCODE
     * @return
     * @throws Exception
     */
    public String createImg(String IDENTIFYCODE) throws Exception{
        BufferedImage image=new BufferedImage(80, 35, BufferedImage.TYPE_INT_BGR);
        //相当于得到一支笔
        Graphics graphics=image.getGraphics();
        graphics.setColor(Color.gray);
        graphics.fillRect(0, 0, 80, 35);
        String randomString=IDENTIFYCODE;
        Random random=new Random();
        //设置画笔的颜色
        graphics.setColor(Color.blue);
        //设置字体的属性
        graphics.setFont(new Font(Font.SERIF, Font.TYPE1_FONT, 20));
        //将随机字符画到图片上
        graphics.drawString(randomString, 12, 26);
        //画横线
        int x=random.nextInt(4),y=0;
        int x1=80-random.nextInt(4),y1=0;
        for(int i=0;i<3;i++){
            graphics.setColor(Color.red);
            y=random.nextInt(35-random.nextInt(4));
            y1=random.nextInt(35-random.nextInt(4));
            graphics.drawLine(x,y,x1,y1);
        }
        //扭曲图片
        shearX(graphics, 80, 35, Color.gray);
        shearY(graphics, 80, 35, Color.gray);
        //生成base64
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image,"png",baos);
        byte[] bytes = baos.toByteArray();
        BASE64Encoder encoder = new BASE64Encoder();
        String base64 = encoder.encodeBuffer(bytes);
        baos.reset();
        return base64;
    }
    /**
     * 扭曲图片X轴
     * @param g
     * @param w1
     * @param h1
     * @param color
     */
    private static void shearX(Graphics g, int w1, int h1, Color color) {
        Random random=new Random();
        int period = random.nextInt(2);
        boolean borderGap = true;
        int frames = 1;
        int phase = random.nextInt(2);
        for (int i = 0; i < h1; i++) {
            double d = (double) (period >> 1)
                    * Math.sin((double) i / (double) period
                    + (6.2831853071795862D * (double) phase)
                    / (double) frames);
            g.copyArea(0, i, w1, 1, (int) d, 0);
            if (borderGap) {
                g.setColor(color);
                g.drawLine((int) d, i, 0, i);
                g.drawLine((int) d + w1, i, w1, i);
            }
        }
    }
    /**
     * 扭曲图片Y轴
     * @param g
     * @param w1
     * @param h1
     * @param color
     */
    private static void shearY(Graphics g, int w1, int h1, Color color) {
        Random random=new Random();
        int period = random.nextInt(40) + 10; // 50;
        boolean borderGap = true;
        int frames = 20;
        int phase = 7;
        for (int i = 0; i < w1; i++) {
            double d = (double) (period >> 1)
                    * Math.sin((double) i / (double) period
                    + (6.2831853071795862D * (double) phase)
                    / (double) frames);
            g.copyArea(i, 0, 1, h1, 0, (int) d);
            if (borderGap) {
                g.setColor(color);
                g.drawLine(i, (int) d, i, 0);
                g.drawLine(i, (int) d + h1, i, h1);
            }
        }
    }
}
