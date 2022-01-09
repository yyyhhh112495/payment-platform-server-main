package com.cwp.jpy.utils;

import com.cwp.jpy.mapper.JpyTaskMapper;
import com.cwp.jpy.model.JpyCount;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Component
public class ProUtil {

    @Resource
    JpyTaskMapper jpyTaskMapper;
    public  String getSeqNo(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Map<String,Object> seq = jpyTaskMapper.getseqno();
        String serialno = "JPY"+ sdf.format(new Date())
                +StringUtilEx.fillString((seq.get("seq").toString()),10,'0');
        return serialno;
    }
}
