package com.cwp.jpy.mapper.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpyTask;
/**
*  @author author
*/
public interface JpyTaskBaseMapper {

    int insertJpyTask(JpyTask object);

    int updateJpyTask(JpyTask object);

    int update(JpyTask.UpdateBuilder object);

    List<JpyTask> queryJpyTask(JpyTask object);

    JpyTask queryJpyTaskLimit1(JpyTask object);

    List<Map<String,Object>> queryJpys(Map<String,Object> object);

    List<Map<String,Object>> cacJpysByStatus(Map<String,Object> objectMap);
    List<Map<String,Object>> cacJpyTransBystatus(Map<String,Object> objectMap);

    int updateJpyTaskByTradenos(Map<String,Object> object);

    int updateJpyTransByTradenos(Map<String,Object> object);

    Map<String, Object> getseqno();

    Map<String, Object> queryTransByTransno(String transno);

    int udpateTaskByTranno(Map<String,Object> object);
    int updateTransByTranno(Map<String,Object> object);

}