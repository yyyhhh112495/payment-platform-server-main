package com.cwp.jpy.sers;

import com.alibaba.fastjson.JSONObject;
import com.cwp.jpy.beans.AppConfigs;
import com.cwp.jpy.mapper.JpyCountMapper;
import com.cwp.jpy.mapper.JpyTaskMapper;
import com.cwp.jpy.model.JpyCount;
import com.cwp.jpy.utils.StringUtilEx;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(value = "/jpysers")
public class router {

    @Resource
    private AliPay aliPay;
    @Resource
    private UserServices userServices;

    @Resource
    private TaskServices taskServices;

    @Resource
    private JpyCountMapper jpyCountMapper;
    @Resource
    private JpyTaskMapper jpyTaskMapper;
    @Resource
    private AppConfigs appConfigs;

    @RequestMapping(value = "/queryList")

    public Object queryList(@RequestBody JSONObject jsonIn){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        JSONObject ret = new JSONObject();
        JpyCount jpyCount = new JpyCount();
        jpyCount.setCountsts("0");
        JpyCount queryCount = jpyCountMapper.queryJpyCountLimit1(jpyCount);
        Map<String,Object> seq = jpyTaskMapper.getseqno();
        String serialno = "JPY"+ StringUtilEx.fillString((seq.get("seq").toString()),10,'0');
        ret.put("seq",serialno);
        ret.put("retcode","ok");
        ret.put("retlist","");
        ret.put("insret",queryCount);
        return ret;
    }

    @RequestMapping(value = "/aliPay")
    public Object aliPayApi(@RequestBody JSONObject jsonObject, @RequestHeader("Host") String host ){
        jsonObject.put("host",host);
        return aliPay.aliPay2(jsonObject);
    }
    @RequestMapping(value = "/aliPayNotify")
    public Object aliPayApiNotify(@RequestParam Map reqMap){
        System.out.println(reqMap);
        return aliPay.aliNotify(reqMap);
    }

    @RequestMapping(value = "/wePayNotify")
    public Object wePayNotify(HttpServletRequest request ){

        return aliPay.wxNotify(request );
    }

    @RequestMapping(value = "/userlogin")
    public Object userlogin(@RequestBody JSONObject jsonObject){

        return  userServices.userLogin(jsonObject);
    }

    @RequestMapping(value = "/getVerPic")
    public Object getVerPic(@RequestBody JSONObject jsonObject){
        return userServices.getVerPic(jsonObject);
    }

    @RequestMapping(value = "/queryOrgInfo")
    public Object queryJpyOrg(@RequestBody JSONObject jsonObject){
        return userServices.queryOrgInfo(jsonObject);
    }
    @RequestMapping(value = "/optOrgInfo")
    public Object optOrgInfo(@RequestBody JSONObject jsonObject){
        return userServices.optOrgInfo(jsonObject);
    }

    @CrossOrigin
    @RequestMapping(value = "/queryCountInfo")
    public Object queryCountOrg(@RequestBody JSONObject jsonObject){
        return userServices.queryCountInfo(jsonObject);
    }
    @RequestMapping(value = "/optCountInfo")
    @CrossOrigin
    public Object optCountInfo(@RequestBody JSONObject jsonObject){
        return userServices.optCountInfo(jsonObject);
    }
    @CrossOrigin
    @RequestMapping(value = "/queryTaskInfo")
    public Object queryTaskInfo(@RequestBody JSONObject jsonObject,@RequestHeader("TellerID") String tellerid){
        jsonObject.put("headTellerid",tellerid);
        return userServices.queryTaskInfo(jsonObject);
    }
    @CrossOrigin
    @RequestMapping(value = "/queryTransInfo")
    public Object queryTransInfo(@RequestBody JSONObject jsonObject){
        return userServices.querTransInfo(jsonObject);
    }
    @RequestMapping(value = "/optTasks")
    public Object optTasks(@RequestBody JSONObject jsonObject,@RequestHeader("TellerID") String tellerid){
        jsonObject.put("tellerid",tellerid);
        return taskServices.optTasks(jsonObject);
    }

    @RequestMapping(value = "/queryTransCon")
    public Object queryTransCon(@RequestBody JSONObject jsonObject){
        return taskServices.queryTransByTranno(jsonObject);
    }

    @RequestMapping(value = "/optTransByNo")
    public Object optTransByNo(@RequestBody JSONObject jsonObject,@RequestHeader("TellerID") String tellerid){
        jsonObject.put("tellerid", tellerid);
        return taskServices.optTransByTranno(jsonObject);
    }
    @RequestMapping(value = "/restPasswd")
    public Object restPasswd(@RequestBody JSONObject jsonObject){ return userServices.restPasswd(jsonObject);}
    @RequestMapping(value = "/chgPasswd")
    public Object chgPasswd(@RequestBody JSONObject jsonObject){ return userServices.chgPasswd(jsonObject);}
    @RequestMapping(value = "/userExit")
    public Object userExit(@RequestBody JSONObject jsonObject){ return userServices.userExit(jsonObject);}
    @RequestMapping(value = "/optJsTask")
    public Object optJsTask(@RequestBody JSONObject jsonObject){ return taskServices.optJsTask(jsonObject);}

    @RequestMapping(value = "/queryTaskTrans")
    public Object queryTaskTrans(@RequestBody JSONObject jsonObject){return taskServices.queryTransRecords(jsonObject);}
    @RequestMapping(value = "/queryTaskTransByBusId")
    public Object queryTaskTransByBusId(@RequestBody JSONObject jsonObject,
                                        @RequestHeader("TellerID") String tellerid){
        jsonObject.put("tellerid", tellerid);
        return taskServices.queryTransRecordsByBussid(jsonObject);
    }
    @RequestMapping(value = "/queryTableHeader")
    public Object queryTableHeader(@RequestBody JSONObject jsonObject,HttpServletRequest request){
        return taskServices.queryTableHeader(jsonObject,request);
    }

    @RequestMapping(value = "/queryTaskRet")
    public Object queryTaskRet(@RequestBody JSONObject jsonObject){
        return taskServices.queryTaskRet(jsonObject);
    }
    public ResponseEntity<FileSystemResource> export(File file) {
        if (file == null) {
            return null;
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", "attachment; filename=" + System.currentTimeMillis() + ".xls");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        headers.add("Last-Modified", new Date().toString());
        headers.add("ETag", String.valueOf(System.currentTimeMillis()));

        return ResponseEntity .ok() .headers(headers) .contentLength(file.length()) .contentType(MediaType.parseMediaType("application/octet-stream")) .body(new FileSystemResource(file));
    }

    @GetMapping(value = "/downloadFile")
    public ResponseEntity<FileSystemResource> downloadFile(@RequestParam("filename") String filename){
//        String filename = jsonObject.getString("filename");
        String tfilename = appConfigs.getTmpfiledir()+"/"+filename;
        return export(new File(tfilename));
    }

}
