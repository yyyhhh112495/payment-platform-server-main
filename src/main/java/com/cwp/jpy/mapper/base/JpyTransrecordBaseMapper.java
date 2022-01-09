package com.cwp.jpy.mapper.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpyTransrecord;
/**
*  @author author
*/
public interface JpyTransrecordBaseMapper {

    int insertJpyTransrecord(JpyTransrecord object);

    int updateJpyTransrecord(JpyTransrecord object);

    int update(JpyTransrecord.UpdateBuilder object);

    List<JpyTransrecord> queryJpyTransrecord(JpyTransrecord object);

    JpyTransrecord queryJpyTransrecordLimit1(JpyTransrecord object);

    Map<String,Object> queryJsNumById(String bussisid);

    Map<String,Object> queryJsNumByIdByStatus(Map<String, Object> queryMap);

    List<Map<String, Object>> queryAllTasks(Map<String, Object> queryMap);

    List<Map<String, Object>> queryAllTaskBybussisId(Map<String, Object> queryMap);

}