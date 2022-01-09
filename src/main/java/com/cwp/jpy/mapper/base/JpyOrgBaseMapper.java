package com.cwp.jpy.mapper.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpyOrg;
/**
*  @author author
*/
public interface JpyOrgBaseMapper {

    int insertJpyOrg(JpyOrg object);

    int updateJpyOrg(JpyOrg object);

    int update(JpyOrg.UpdateBuilder object);

    List<JpyOrg> queryJpyOrg(JpyOrg object);

    JpyOrg queryJpyOrgLimit1(JpyOrg object);


}