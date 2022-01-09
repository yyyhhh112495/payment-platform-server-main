package com.cwp.jpy.intceptor;

import com.alibaba.fastjson.JSONObject;
import com.cwp.jpy.beans.BaseConstant;
import com.cwp.jpy.model.JpySession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransIntercept implements HandlerInterceptor {
    private final static Logger log = LoggerFactory.getLogger(TransIntercept.class);

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handle){
        String contextPath = request.getContextPath();
        String method = request.getMethod().toUpperCase();
        String regex = contextPath + "/";
        String url = request.getRequestURI().replaceFirst(regex, "/");
        String token = request.getHeader("Access-Token");
        String TellerID = request.getHeader("TellerID");
        log.info("------token:{}---tellerid:{}",token,TellerID);
        return true;
    }
}
