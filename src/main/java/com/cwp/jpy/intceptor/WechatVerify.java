package com.cwp.jpy.intceptor;

import org.springframework.util.Base64Utils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Signature;
import java.security.cert.X509Certificate;

public class WechatVerify implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
    public boolean verify(String srcData, X509Certificate certificate, String sign, String Serial) throws Exception {
        //先验证证书序列号是否正确
        if (certificate.getSerialNumber().toString(16).toUpperCase().equals(Serial)){
            Signature sha256withRSA = Signature.getInstance("SHA256withRSA");
            sha256withRSA.initVerify(certificate.getPublicKey());
            sha256withRSA.update(srcData.getBytes());
            return  sha256withRSA.verify(Base64Utils.decodeFromString(sign));
        }else {
            return false;
        }
    }
}
