package com.cwp.jpy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpyWepayRes;
/**
*  @author author
*/
public interface JpyWepayResBaseMapper {

    int insertJpyWepayRes(JpyWepayRes object);

    int updateJpyWepayRes(JpyWepayRes object);

    int update(JpyWepayRes.UpdateBuilder object);

    List<JpyWepayRes> queryJpyWepayRes(JpyWepayRes object);

    JpyWepayRes queryJpyWepayResLimit1(JpyWepayRes object);

}