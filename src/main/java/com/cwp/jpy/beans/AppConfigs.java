package com.cwp.jpy.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("jpy")
public class AppConfigs {
    private String alipayprivatekey;
    private String alipaypublicKey;
    private String alipayappid;

    private String alipayserverUrl;

    private String host;
    private String defaultmenu;
    private String tmpfiledir;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    private String success;

    public String getAlipublicKey() {
        return alipublicKey;
    }

    public void setAlipublicKey(String alipublicKey) {
        this.alipublicKey = alipublicKey;
    }

    private String alipublicKey;



    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getAlipaypublicKey() {
        return alipaypublicKey;
    }

    public void setAlipaypublicKey(String alipaypublicKey) {
        this.alipaypublicKey = alipaypublicKey;
    }

    public String getAlipayappid() {
        return alipayappid;
    }

    public void setAlipayappid(String alipayappid) {
        this.alipayappid = alipayappid;
    }

    public String getAlipayserverUrl() {
        return alipayserverUrl;
    }

    public void setAlipayserverUrl(String alipayserverUrl) {
        this.alipayserverUrl = alipayserverUrl;
    }



    public String getAlipayprivatekey() {
        return alipayprivatekey;
    }

    public void setAlipayprivatekey(String alipayprivatekey) {
        this.alipayprivatekey = alipayprivatekey;
    }

    public String getDefaultmenu() {
        return defaultmenu;
    }

    public void setDefaultmenu(String defaultmenu) {
        this.defaultmenu = defaultmenu;
    }

    public String getTmpfiledir() {
        return tmpfiledir;
    }

    public void setTmpfiledir(String tmpfiledir) {
        this.tmpfiledir = tmpfiledir;
    }
}
