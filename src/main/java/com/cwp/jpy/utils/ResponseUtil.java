package com.cwp.jpy.utils;

import com.alibaba.fastjson.JSONObject;
import com.cwp.jpy.sers.impl.UserServicesImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResponseUtil {
    private final static Logger log = LoggerFactory.getLogger(ResponseUtil.class);
    public static JSONObject retSuccess(JSONObject body){
        JSONObject ret = new JSONObject();
        ret.put("retCode","1");
        ret.put("retMsg", "success");
        ret.put("retData",body);
        log.info("----ret success---{}",ret.toJSONString());
        return ret;
    }

    public static JSONObject retErro(JSONObject body,String erromsg){
        JSONObject ret = new JSONObject();
        ret.put("retCode", "0");
        ret.put("retMsg",erromsg);
        ret.put("retData",body);
        log.info("----ret error---{}",ret.toJSONString());
        return ret;
    }
}
