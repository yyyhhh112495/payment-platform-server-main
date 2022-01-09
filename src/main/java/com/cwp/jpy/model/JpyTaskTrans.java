package com.cwp.jpy.model;

import java.io.Serializable;

public class JpyTaskTrans implements Serializable {
    private String tradeNo;
    private String bussinessname;
    private String payres;
    private String bussratio;
    private String tradenum;
    private String transprofit;
    private String transnum;
    private String paytime;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getBussinessname() {
        return bussinessname;
    }

    public void setBussinessname(String bussinessname) {
        this.bussinessname = bussinessname;
    }

    public String getPayres() {
        return payres;
    }

    public void setPayres(String payres) {
        this.payres = payres;
    }

    public String getBussratio() {
        return bussratio;
    }

    public void setBussratio(String bussratio) {
        this.bussratio = bussratio;
    }

    public String getTradenum() {
        return tradenum;
    }

    public void setTradenum(String tradenum) {
        this.tradenum = tradenum;
    }

    public String getTransprofit() {
        return transprofit;
    }

    public void setTransprofit(String transprofit) {
        this.transprofit = transprofit;
    }

    public String getTransnum() {
        return transnum;
    }

    public void setTransnum(String transnum) {
        this.transnum = transnum;
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }


}
