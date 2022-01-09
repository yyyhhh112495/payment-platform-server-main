package com.cwp.jpy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpyAliRes;
/**
*  @author author
*/
public interface JpyAliResBaseMapper {

    int insertJpyAliRes(JpyAliRes object);

    int updateJpyAliRes(JpyAliRes object);

    int update(JpyAliRes.UpdateBuilder object);

    List<JpyAliRes> queryJpyAliRes(JpyAliRes object);

    JpyAliRes queryJpyAliResLimit1(JpyAliRes object);

}