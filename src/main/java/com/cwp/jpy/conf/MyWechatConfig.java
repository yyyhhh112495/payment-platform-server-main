package com.cwp.jpy.conf;

import com.cwp.jpy.utils.IWXPayDomain;
import com.cwp.jpy.utils.WXPayConfig;

import java.io.InputStream;

public   class MyWechatConfig extends WXPayConfig {
    private String appid;
    private String mchId;
    private String key;
    private InputStream cert;

    public MyWechatConfig(String appid,String mchId,String key,InputStream cert){
        this.appid = appid;
        this.mchId = mchId;
        this.key = key;
        this.cert = cert;
    }
    /**
     * 获取 App ID
     *
     * @return App ID
     */
    public String getAppID() {
        return this.appid;
    }


    /**
     * 获取 Mch ID
     *
     * @return Mch ID
     */
    public String getMchID() {
        return this.mchId;
    }


    /**
     * 获取 API 密钥
     *
     * @return API密钥
     */
    public String getKey() {
        return this.key;
    }


    /**
     * 获取商户证书内容
     *
     * @return 商户证书内容
     */
    public InputStream getCertStream() {
        return this.cert;
    }

    @Override
    public IWXPayDomain getWXPayDomain() {
        return null;
    }


}
