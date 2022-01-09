package com.cwp.jpy.intceptor;

import com.alibaba.fastjson.JSONObject;
import com.cwp.jpy.beans.BaseConstant;
import com.cwp.jpy.mapper.JpySessionMapper;
import com.cwp.jpy.model.JpySession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserAuthCheck implements HandlerInterceptor {
    private final static Logger log = LoggerFactory.getLogger(UserAuthCheck.class);
    @Resource
    JpySessionMapper jpySessionMapper;
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handle){
        String contextPath = request.getContextPath();
        String method = request.getMethod().toUpperCase();
        String regex = contextPath + "/";
        String url = request.getRequestURI().replaceFirst(regex, "/");
        String token = request.getHeader("Access-Token");
        String TellerID = request.getHeader("TellerID");
        log.info("------token:{}---tellerid:{}",token,TellerID);
        JpySession jpySession = new JpySession();
        jpySession.setUserid(Integer.valueOf(TellerID));
        jpySession.setSession(token);
        log.info("---jpySessionMapper--{}",jpySessionMapper==null);
        JpySession queryjpysession = jpySessionMapper.queryJpySessionLimit1(jpySession);
        if(null!=queryjpysession ){
            SimpleDateFormat sdf = new SimpleDateFormat(BaseConstant.sdf);
            log.info("---queryjpysession is : {}", JSONObject.toJSONString(queryjpysession));
            String updatetime = queryjpysession.getTimer();
            try {
                long timespace = (System.currentTimeMillis()-sdf.parse(updatetime).getTime())/1000;
                if(timespace>1800){
                    JSONObject ret = new JSONObject();
                    ret.put("retCode","3");
                    ret.put("retMsg","请重新登录！");
                    response.setCharacterEncoding("UTF-8");
                    response.setContentType("application/json");
                    try {
                        response.getWriter().println(ret.toJSONString());
                        log.info("----response----");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return false;
                }else{
                    queryjpysession.setTimer(sdf.format(new Date()));
                    jpySessionMapper.updateJpySession(queryjpysession);
                }
            } catch (ParseException e) {
                e.printStackTrace();
                log.info("----exception------");
            }
        }else {
            log.info("------has not jpysession-----");
            JSONObject ret = new JSONObject();
            ret.put("retCode","3");
            ret.put("retMsg","请先登录！");
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            try {
                response.getWriter().println(ret.toJSONString());
                log.info("----response----");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
        return true;
    }
}
