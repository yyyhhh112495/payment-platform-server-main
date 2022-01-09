package com.cwp.jpy.conf;

import com.alibaba.fastjson.JSONObject;
import com.cwp.jpy.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(value = Exception.class)
    public Object defaultExceptionHandler(HttpServletRequest req, Exception e){
        log.info("------exception-----{}",e.toString());
        return ResponseUtil.retErro(new JSONObject(),"发生异常!" );
    }
}
