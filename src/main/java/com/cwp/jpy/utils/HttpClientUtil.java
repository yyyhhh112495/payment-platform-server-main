package com.cwp.jpy.utils;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class HttpClientUtil {
    private final static Logger log = LoggerFactory.getLogger(HttpClientUtil.class);
    public static String postJson(String url, String reqbody, Map<String,String> headers){
        String ret = "";
        log.info("-------req to : {}----body---{}",url,reqbody);
        try {
            URL requrl = new URL(url);
            //打开url连接
            HttpURLConnection connection = (HttpURLConnection) requrl.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Connection","Keep-Alive");
            connection.setRequestProperty("Content-Type","text/plain");
            if(!headers.isEmpty()){
                for (String key : headers.keySet()){
                    connection.setRequestProperty(key,headers.get(key));
                    log.info("----header--{}----{}",key,headers.get(key));
                }
            }
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
            dataOutputStream.write(reqbody.getBytes(StandardCharsets.UTF_8));
            dataOutputStream.flush();
            dataOutputStream.close();

            connection.connect();
             //获取响应头
            Map<String, List<String>> rspHeaders = connection.getHeaderFields();
            for(String key : rspHeaders.keySet()){
                log.info("----rsp header : {}----content: {}",key,rspHeaders.get(key));
            }
            //输入流
            BufferedReader bufferedReader = null;
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String getLine;
            while ((getLine = bufferedReader.readLine())!=null){
                ret += getLine;
            }
            bufferedReader.close();
            log.info("----req rsp :{}",ret);
        } catch (MalformedURLException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ret;
    }
}
