package com.cwp.jpy.utils;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

@Component
public class MD5Utils {
    /**
     * 计算MD5
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    public  static String digestMD5(byte[] bytes) throws Exception {
        // 获取MD5计算器
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(bytes);
        // 拼md5的string
        byte[] result = md.digest();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            String s = Integer.toHexString(0xff & result[i]);
            if (s.length() < 2) {
                sb.append('0');
            }
            sb.append(s);
        }
        String res = sb.toString();
        return res;
    }

    /**
     * 计算MD5
     *
     * @param file
     * @return
     * @throws Exception
     */
    public   String digestMD5(File file) throws Exception {
        String res = null;
        InputStream is = null;
        try {
            // 创建输入流
            is = new FileInputStream(file);
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] buffer = new byte[4096];
            int length = 0;
            while ((length = is.read(buffer)) > 0) {
                md.update(buffer, 0, length);
            }

            // 拼md5的string
            byte[] result = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                String s = Integer.toHexString(0xff & result[i]);
                if (s.length() < 2) {
                    sb.append('0');
                }
                sb.append(s);
            }
            res = sb.toString();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                // do nothing
            }
        }
        return res;
    }
}
