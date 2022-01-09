package com.cwp.jpy.sers;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


public interface AliPay {
      Object aliPay2(JSONObject jsonObject)  ;

      Object aliNotify(Map<String,String> params);

      Object wxNotify(HttpServletRequest request );

}
