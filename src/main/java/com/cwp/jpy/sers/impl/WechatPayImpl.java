package com.cwp.jpy.sers.impl;

import com.alibaba.fastjson.JSONObject;
import com.cwp.jpy.conf.MyWechatConfig;
import com.cwp.jpy.mapper.JpyCountMapper;
import com.cwp.jpy.model.JpyCount;
import com.cwp.jpy.sers.WechatPay;
import com.cwp.jpy.utils.ResponseUtil;
import com.cwp.jpy.utils.WXPay;
import com.cwp.jpy.utils.WXPayConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

public class WechatPayImpl implements WechatPay {
    private final static Logger log = LoggerFactory.getLogger(WechatPayImpl.class);
    @Resource
    JpyCountMapper jpyCountMapper;
    @Override
    public Object getWechatPayUrl(JSONObject jsonObject) {
        JSONObject retJson = new JSONObject();
        JpyCount jpyCount = new JpyCount();
        jpyCount.setCountsts("1");
        JpyCount queryJpyCount = jpyCountMapper.queryJpyCountLimit1(jpyCount);
        if(null==queryJpyCount){
            return ResponseUtil.retErro(retJson,"微信收款账户配置错误！");
        }
        String appid = queryJpyCount.getWechatappid();
        String mchid = queryJpyCount.getWechatmchid();
        String key =  queryJpyCount.getWechatkey();
        MyWechatConfig myWechatConfig = new MyWechatConfig(appid,mchid,key,null);
        try {
            Map<String, String> data = new HashMap<String, String>();
            data.put("body", "腾讯充值中心-QQ会员充值");
            data.put("out_trade_no", "2016090910595900000012");
            data.put("device_info", "");
            data.put("fee_type", "CNY");
            data.put("total_fee", "1");
            data.put("spbill_create_ip", "123.12.12.123");
            data.put("notify_url", "http://www.example.com/wxpay/notify");
            data.put("trade_type", "NATIVE");  // 此处指定为扫码支付
            data.put("product_id", "12");
            WXPay wxPay = new WXPay(myWechatConfig);
            Map<String,String> wxret = wxPay.unifiedOrder(data);
            log.info("wxret------{}",wxret);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
