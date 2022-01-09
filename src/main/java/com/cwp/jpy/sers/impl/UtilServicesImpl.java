package com.cwp.jpy.sers.impl;

import com.cwp.jpy.mapper.JpyTaskMapper;
import com.cwp.jpy.sers.UtilServices;
import com.cwp.jpy.utils.StringUtilEx;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Component
public class UtilServicesImpl implements UtilServices {
    @Resource
    private JpyTaskMapper jpyTaskMapper;

    @Override
    public String getSerialno() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Map<String,Object> seq = jpyTaskMapper.getseqno();
        String serialno = "JPY"+ sdf.format(new Date())
                + StringUtilEx.fillString((seq.get("seq").toString()),10,'0');
        return serialno;
    }
}
