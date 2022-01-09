package com.cwp.jpy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpyNotify;
/**
*  @author author
*/
public interface JpyNotifyBaseMapper {

    int insertJpyNotify(JpyNotify object);

    int updateJpyNotify(JpyNotify object);

    int update(JpyNotify.UpdateBuilder object);

    List<JpyNotify> queryJpyNotify(JpyNotify object);

    JpyNotify queryJpyNotifyLimit1(JpyNotify object);

}