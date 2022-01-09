package com.cwp.jpy.sers;

import com.alibaba.fastjson.JSONObject;

public interface WechatPay {
    Object getWechatPayUrl(JSONObject jsonObject);
}
