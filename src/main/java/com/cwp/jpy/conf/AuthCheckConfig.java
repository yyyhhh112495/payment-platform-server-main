package com.cwp.jpy.conf;

import com.cwp.jpy.intceptor.UserAuthCheck;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Component
public class AuthCheckConfig implements WebMvcConfigurer {
    @Bean
    public UserAuthCheck userAuthCheck(){
        return new UserAuthCheck();
    }
    public void addInterceptors(InterceptorRegistry interceptorRegistry){
        InterceptorRegistration registration = interceptorRegistry.addInterceptor(userAuthCheck());
        registration.addPathPatterns("/**");//拦截所有的请求
        registration.excludePathPatterns("/jpysers/aliPay",
                "/jpysers/aliPayNotify","/jpysers/userlogin",
                "/jpysers/getVerPic","/jpysers/downloadFile",
                "/jpysers/wePayNotify","*/aliPayNotify",
                "*/wePayNotify","/jpysers/wePayNotify",
                "/error","/jpysers/userExit","/jpysers/queryTaskRet");

    }
    public void  addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("POST","GET","OPTIONS")
                .maxAge(3600)
                 ;
    }
}
