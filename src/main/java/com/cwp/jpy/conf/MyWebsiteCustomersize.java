package com.cwp.jpy.conf;

import org.springframework.boot.autoconfigure.web.embedded.TomcatWebServerFactoryCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
    public class MyWebsiteCustomersize   {

       @Bean
       public ServletWebServerFactory webServerFactory(){
           TomcatServletWebServerFactory tsw = new TomcatServletWebServerFactory();
           tsw.addConnectorCustomizers(
                   (TomcatConnectorCustomizer) connector -> connector.setProperty(
                           "relaxedQueryChars","[]{}"
                   )
           );
           return tsw;
       }
    }

