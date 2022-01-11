package com.cwp.jpy.sers.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cwp.jpy.annos.AuthCheck;
import com.cwp.jpy.beans.AppConfigs;
import com.cwp.jpy.beans.BaseConstant;
import com.cwp.jpy.mapper.JpyTaskMapper;
import com.cwp.jpy.mapper.JpyTransMapper;
import com.cwp.jpy.mapper.JpyTransrecordMapper;
import com.cwp.jpy.mapper.JpyUserMapper;
import com.cwp.jpy.model.*;
import com.cwp.jpy.sers.TaskServices;
import com.cwp.jpy.sers.UtilServices;
import com.cwp.jpy.utils.ExportUtil;
import com.cwp.jpy.utils.MathUtil;
import com.cwp.jpy.utils.ResponseUtil;
import com.cwp.jpy.utils.StringUtilEx;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TaskServicesImpl implements TaskServices {
    private final static Logger log = LoggerFactory.getLogger(TaskServicesImpl.class);
    @Resource
    private JpyTaskMapper jpyTaskMapper;
    @Resource
    private UtilServices utilServices;
    @Resource
    private JpyTransrecordMapper jpyTransrecordMapper;
    @Resource
    private JpyUserMapper jpyUserMapper;
    @Resource
    private AppConfigs appConfigs;
    @Resource
    private ExportUtil exportUtil;

    @Override
    public Object queryTaskByBusid(JSONObject jsonObject) {
        String bussinessid = jsonObject.getString("bussinessid");
        JSONObject retJson = new JSONObject();
        if(StringUtilEx.isNullOrEmpty(bussinessid)){
            return ResponseUtil.retErro(retJson,"商户id有误~！");
        }
        JpyTask jpyTask = new JpyTask();
        jpyTask.setBussinessid(bussinessid);
        List<JpyTask> jpyTasks = jpyTaskMapper.queryJpyTask(jpyTask);
        retJson.put("tasks", jpyTasks);
        return ResponseUtil.retSuccess(retJson);
    }

    @Override
    public Object optTasks(JSONObject jsonObject) {
        JSONObject retJson = new JSONObject();
        String countid = jsonObject.getString("countid");//账号
        String countname = jsonObject.getString("countname");//户名
        String countbankname = jsonObject.getString("countbankname");//开户行
        String jsnum = jsonObject.getString("jsnum");
        String tellerid = jsonObject.getString("tellerid");
        if(StringUtilEx.isNullOrEmpty(countid) || StringUtilEx.isNullOrEmpty(countname)
        || StringUtilEx.isNullOrEmpty(countbankname)||StringUtilEx.isNullOrEmpty(jsnum)
        || StringUtilEx.isNullOrEmpty(tellerid)){
            return ResponseUtil.retErro(retJson,"上送参数有误");
        }
        log.info("-----countid----{}",countid);
        SimpleDateFormat sdf = new SimpleDateFormat(BaseConstant.sdf);
        JpyUser queryJpyUser = new JpyUser();
        queryJpyUser.setUserid(Integer.valueOf(tellerid));
        JpyUser jpyUser = jpyUserMapper.queryJpyUserLimit1(queryJpyUser);
        if(null!=jpyUser){
            String bussisid = jpyUser.getBussinessid();
            Map<String,Object> transrecords = jpyTransrecordMapper.queryJsNumById(bussisid);
            Double hadTransTotalDouble = (Double) transrecords.get("totaljsnum");
            String hadTransTotal = String.valueOf(hadTransTotalDouble);
            Map<String ,Object> queryMap = new HashMap<>();
            queryMap.put("bussinessid",bussisid);
            List<Map<String,Object>> tranTotalMap = jpyTaskMapper.cacJpysByStatus(queryMap);
            String tradeTotransTotal = "0";
            if(null!=tranTotalMap && tranTotalMap.size()>0){
                Map<String,Object> item = tranTotalMap.get(0);
                if(null!=item){
                    Double tradeTotransTotalDouble = (Double) item.get("jsnum");
                    tradeTotransTotal = String.valueOf(tradeTotransTotalDouble);
                }
            }
            if(MathUtil.compare(tradeTotransTotal, (MathUtil.addBigDecimal(hadTransTotal,jsnum)))>=0){
                log.info("---tradeTotransTotal :{}---hadTransTotal:{}--jsnum:{}--",
                        tradeTotransTotal,hadTransTotal,jsnum);

            }else{
                return ResponseUtil.retErro(retJson,"结算额度超限！");
            }
            JpyTransrecord jpyTransrecord = new JpyTransrecord();
            jpyTransrecord.setBussid(jpyUser.getBussinessid());
            jpyTransrecord.setJsnum(jsnum);
            jpyTransrecord.setJstime(sdf.format(new Date()));
            jpyTransrecord.setTransbankname(countbankname);
            jpyTransrecord.setTranscountid(countid);
            jpyTransrecord.setTranscountname(countname);
            String tradeno = utilServices.getSerialno();
            log.info("----trans---tradeno---{}",tradeno);
            jpyTransrecord.setJstradeno(tradeno);
            jpyTransrecord.setTranstatus("0");
            int a = jpyTransrecordMapper.insertJpyTransrecord(jpyTransrecord);
            if(a>0){
                log.info("----insert success-------");
            }else{
                return ResponseUtil.retErro(retJson, "操作失败！");
            }
        }else{
            return ResponseUtil.retErro(retJson,"错误！");
        }
        return ResponseUtil.retSuccess(retJson);
    }

    @Override

    public Object queryTransByTranno(JSONObject jsonObject) {
        String transno = jsonObject.getString("transno");
        JSONObject retJson = new JSONObject();
        if(!StringUtilEx.isNullOrEmpty(transno)){
            Map<String,Object> retMap = jpyTaskMapper.queryTransByTransno(transno);
            retJson.putAll(retMap);
        }else{
            return ResponseUtil.retErro(retJson,"结算流水号不能为空！");
        }
        return ResponseUtil.retSuccess(retJson);
    }

    @Override
    public Object optTransByTranno(JSONObject jsonObject) {
        String transno = jsonObject.getString("transno");
        SimpleDateFormat sdf = new SimpleDateFormat(BaseConstant.sdf);
        JSONObject retJson = new JSONObject();
        if(!StringUtilEx.isNullOrEmpty(transno)){
            log.info("----optTransByTranno-->{}",transno);
            Map<String,Object> paraMap = new HashMap<>();
            paraMap.put("transstatus","3");
            paraMap.put("transno",transno);
            int uptasks = jpyTaskMapper.udpateTaskByTranno(paraMap);
            log.info("-----update-jpytasks : {}",uptasks);
            paraMap.put("transcomtimer",sdf.format(new Date()));
            int uptrans = jpyTaskMapper.updateTransByTranno(paraMap);
            log.info("----update jpytrans  : {}",uptrans);
        }else{
            return ResponseUtil.retErro(retJson,"结算流水号不能为空！");
        }
        return ResponseUtil.retSuccess(retJson);
    }


    @Override
    public Object queryTableHeader(JSONObject jsonObject, HttpServletRequest request) {
        String tellerId = request.getHeader("TellerID");
        JpyUser jpyUser = new JpyUser();
        jpyUser.setUserid(Integer.valueOf(tellerId));
        JpyUser queryUser = jpyUserMapper.queryJpyUserLimit1(jpyUser);
        JSONObject retJson = new JSONObject();
        String busid = queryUser.getBussinessid();
        if(null== queryUser){
            return ResponseUtil.retErro(retJson, "人员为空！");
        }
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("bussinessid",busid);
        List<Map<String, Object>> retList = jpyTaskMapper.cacJpysByStatus(paramMap);
        log.info("-------retlist----{}",retList);
        for (int i=0;i<retList.size();i++){
            Map<String, Object> item = retList.get(i);

        }
        return null;
    }

    @Override
    public Object queryTransRecords(JSONObject jsonObject) {
        JSONObject retJson = new JSONObject();
        Map<String,Object> queryMap = new HashMap<>();
        String bussinessname = jsonObject.getString("bussinessname");
        String transtatus = jsonObject.getString("transtatus");
        if(!StringUtilEx.isNullOrEmpty(bussinessname)){
            queryMap.put("bussinessname", bussinessname);
        }
        if(!StringUtilEx.isNullOrEmpty(transtatus)){
            queryMap.put("transtatus", transtatus);
        }
        log.info("-----queryTransRecords-----");
        String exportFlag = jsonObject.getString("export");
        if(null!=exportFlag && "1".equals(exportFlag)){
            log.info("----export excel-----");
            List<Map<String,Object>> exporlist = jpyTransrecordMapper.queryAllTasks(queryMap);
            String [] title = new String[]{
                    "收款行","户名","卡号","商户名称","结算批次号","结算金额","利润","结算状态","申请时间","结算时间"
            };
            String [] keys = new String[]{"transbankname","transcountname","transcountid","bussinessname","jstradeno",
                    "jsnum","profit","transtatus","jstime","transcomtime"};
            Map<String, Object> code = new HashMap<>();
            Map<String,Object> payresMap = new HashMap<>();
            payresMap.put("0","结算中");
            payresMap.put("1","已结算");
            code.put("transtatus",payresMap);
            String filename = exportUtil.getHSSFWorkbook(title, keys, "提现导出",
                    null,exporlist,code);
            String retfileName = appConfigs.getHost()+"/jpysers/downloadFile?filename="+filename;
            log.info("---filename->:{}",retfileName);
            retJson.put("filename",retfileName);
            return ResponseUtil.retSuccess(retJson);
        }
        int page = (Integer) jsonObject.get("pageNum");
        int pagesize = (Integer)jsonObject.get("pageSize");


        List<Map<String,Object>> tableHeaderList = jpyTaskMapper.cacJpysByStatus(queryMap);
        retJson.put("totalpay","0");
        retJson.put("paysuc","0");
        retJson.put("payfai","0");
        retJson.put("jsnum","0");
        retJson.put("jsingnum","0");
        retJson.put("jsednum","0");
        retJson.put("jsbefore","0");
        if(null != tableHeaderList && tableHeaderList.size()>0 ){
            Map<String, Object> item = tableHeaderList.get(0);
            log.info("------item---{}",item);
            String jsnum = StringUtilEx.convertToString(item.get("jsnum"));
            Map<String,Object> recordMap = jpyTransrecordMapper.queryJsNumByIdByStatus(queryMap);
            if(null!=recordMap){
                String jsingnum = StringUtilEx.convertToString(recordMap.get("jsingnum"));
                String jsednum = StringUtilEx.convertToString(recordMap.get("jsednum"));
                retJson.put("jsingnum",jsingnum);
                retJson.put("jsednum",jsednum);
                String jsbefore = MathUtil.subtractBigDecimal(jsnum,MathUtil.addBigDecimal(jsednum,jsingnum));
                retJson.put("jsbefore",jsbefore);
            }
            retJson.putAll(item);
        }

        PageHelper.startPage(page, pagesize);
        List<Map<String,Object>> retList = jpyTransrecordMapper.queryAllTasks(queryMap);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(retList);
        retJson.put("list",retList);
        retJson.put("total",pageInfo.getTotal());
         return ResponseUtil.retSuccess(retJson);
    }

    @Override
    public Object queryTransRecordsByBussid(JSONObject jsonObject) {
        JSONObject retJson = new JSONObject();
        Map<String,Object> queryMap = new HashMap<>();
        String bussinessname = jsonObject.getString("bussinessname");
        String transtatus = jsonObject.getString("transtatus");
        String tellerid = jsonObject.getString("tellerid");
        JpyUser jpyUser = new JpyUser();
        jpyUser.setUserid(Integer.valueOf(tellerid));
        JpyUser queryJpyuser = jpyUserMapper.queryJpyUserLimit1(jpyUser);
        if(null==queryJpyuser){
            return ResponseUtil.retErro(retJson,"错误！");
        }
        queryMap.put("bussinessid",queryJpyuser.getBussinessid());
        if(!StringUtilEx.isNullOrEmpty(bussinessname)){
            queryMap.put("bussinessname", bussinessname);
        }
        if(!StringUtilEx.isNullOrEmpty(transtatus)){
            queryMap.put("transtatus", transtatus);
        }
        String exportFlag = jsonObject.getString("export");
        if(null!=exportFlag && "1".equals(exportFlag)){
            log.info("----export excel-----");
            List<Map<String,Object>> exporlist = jpyTransrecordMapper.queryAllTaskBybussisId(queryMap);
            String [] title = new String[]{
                    "收款行","户名","卡号","商户名称","结算批次号","结算金额","结算状态","申请时间","结算时间"
            };
            String [] keys = new String[]{"transbankname","transcountname","transcountid","bussinessname","jstradeno",
                    "jsnum","transtatus","jstime","transcomtime"};
            Map<String, Object> code = new HashMap<>();
            Map<String,Object> payresMap = new HashMap<>();
            payresMap.put("0","结算中");
            payresMap.put("1","已结算");
            code.put("transtatus",payresMap);
            String filename = exportUtil.getHSSFWorkbook(title, keys, "提现导出",
                    null,exporlist,code);
            String retfileName = appConfigs.getHost()+"/jpysers/downloadFile?filename="+filename;
            log.info("---filename->:{}",retfileName);
            retJson.put("filename",retfileName);
            return ResponseUtil.retSuccess(retJson);
        }
        int page = (Integer) jsonObject.get("pageNum");
        int pagesize = (Integer)jsonObject.get("pageSize");


        List<Map<String,Object>> tableHeaderList = jpyTaskMapper.cacJpysByStatus(queryMap);
        retJson.put("totalpay","0");
        retJson.put("paysuc","0");
        retJson.put("payfai","0");
        retJson.put("jsnum","0");
        retJson.put("jsingnum","0");
        retJson.put("jsednum","0");
        retJson.put("jsbefore","0");
        if(null != tableHeaderList && tableHeaderList.size()>0 ){
            Map<String, Object> item = tableHeaderList.get(0);
            log.info("------item---{}",item);
            if(null!=item){
                String jsnum = StringUtilEx.convertToString(item.get("jsnum"));
                log.info("----queryMap--{}",queryMap);
                Map<String,Object> recordMap = jpyTransrecordMapper.queryJsNumByIdByStatus(queryMap);
                if(null!=recordMap){
                    String jsingnum = StringUtilEx.convertToString(recordMap.get("jsingnum"));
                    String jsednum = StringUtilEx.convertToString(recordMap.get("jsednum"));
                    retJson.put("jsingnum",jsingnum);
                    retJson.put("jsednum",jsednum);
                    String jsbefore = MathUtil.subtractBigDecimal(jsnum,MathUtil.addBigDecimal(jsednum,jsingnum));
                    retJson.put("jsbefore",jsbefore);
                }
                retJson.putAll(item);
            }
        }

        PageHelper.startPage(page, pagesize);
        List<Map<String,Object>> retList = jpyTransrecordMapper.queryAllTaskBybussisId(queryMap);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(retList);
        retJson.put("list",retList);
        retJson.put("total",pageInfo.getTotal());
        return ResponseUtil.retSuccess(retJson);
    }

    @Override
    public Object optJsTask(JSONObject jsonObject) {
        String jstradeno = jsonObject.getString("jstradeno");
        JSONObject retJson = new JSONObject();
        if(StringUtilEx.isNullOrEmpty(jstradeno)){
            return ResponseUtil.retErro(retJson,"流水号不能为空！");
        }
        log.info("----optJsTask -:{}",jstradeno);
        JpyTransrecord jpyTransrecord = new JpyTransrecord();
        jpyTransrecord.setJstradeno(jstradeno);
        log.info("-----optjstask is {}", JSON.toJSONString(jpyTransrecord));
        JpyTransrecord queryJpytasktran = jpyTransrecordMapper.queryJpyTransrecordLimit1(jpyTransrecord);
        if(null==queryJpytasktran){
            return ResponseUtil.retErro(retJson, "错误！");
        }
        SimpleDateFormat sdf = new SimpleDateFormat(BaseConstant.sdf);
        queryJpytasktran.setTranstatus("1");
        queryJpytasktran.setTranscomtime(sdf.format(new Date()));
        int a = jpyTransrecordMapper.updateJpyTransrecord(queryJpytasktran);
        if(a>0){
            return ResponseUtil.retSuccess(retJson);
        }else{
            return ResponseUtil.retErro(retJson,"更新失败！");
        }

    }

    @Override
    public Object queryTaskRet(JSONObject jsonObject) {
        JSONObject retJson = new JSONObject();
        String tradeno = jsonObject.getString("tradeno");
        String bussid = jsonObject.getString("bussid");
        JpyTask jpyTask = new JpyTask();
        jpyTask.setTradeNo(tradeno);
        jpyTask.setBussinessid(bussid);
        JpyTask queryJpytask = jpyTaskMapper.queryJpyTaskLimit1(jpyTask);
        if(null!=queryJpytask){
            String queryret = queryJpytask.getPayres();
            retJson.put("tradeno",tradeno);
            retJson.put("payret",queryret);
            retJson.put("tranNum",queryJpytask.getTradenum());
            return ResponseUtil.retSuccess(retJson);
        }else{
            return ResponseUtil.retErro(retJson,"业务不存在！");
        }
    }
    @Override
    public Object delRecords(JSONObject jsonObject) {
        String bussinessid = jsonObject.getString("bussinessid");
        JSONObject retJson = new JSONObject();
        if(StringUtilEx.isNullOrEmpty(bussinessid)){
            return ResponseUtil.retErro(retJson,"参数错误！");
        }
        int task = jpyTaskMapper.delTaskById(bussinessid);
        log.info("----del bussinessid {}---tasks :{}",bussinessid,task);
        int trans = jpyTaskMapper.delTransById(bussinessid);
        log.info("----del bussinessid {}---trans :{}",bussinessid,trans);
        int records = jpyTaskMapper.delTaskTransById(bussinessid);
        log.info("----del bussinessid {}---records :{}",bussinessid,records);
        return ResponseUtil.retSuccess(retJson);
    }
}
