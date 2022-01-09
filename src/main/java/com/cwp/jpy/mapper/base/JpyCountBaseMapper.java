package com.cwp.jpy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpyCount;
/**
*  @author author
*/
public interface JpyCountBaseMapper {

    int insertJpyCount(JpyCount object);

    int updateJpyCount(JpyCount object);

    int update(JpyCount.UpdateBuilder object);

    List<JpyCount> queryJpyCount(JpyCount object);

    JpyCount queryJpyCountLimit1(JpyCount object);

}