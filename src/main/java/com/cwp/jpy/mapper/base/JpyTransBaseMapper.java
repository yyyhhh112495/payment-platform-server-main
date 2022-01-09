package com.cwp.jpy.mapper.base;

import java.util.List;
import java.util.Map;

import com.cwp.jpy.model.JpyTaskTrans;
import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpyTrans;
/**
*  @author author
*/
public interface JpyTransBaseMapper {

    int insertJpyTrans(JpyTrans object);

    int updateJpyTrans(JpyTrans object);

    int update(JpyTrans.UpdateBuilder object);

    List<JpyTrans> queryJpyTrans(JpyTrans object);

    JpyTrans queryJpyTransLimit1(JpyTrans object);

    List<Map<String, Object>> queryJpyTransRetMap(Map<String, Object> queryMap);
    List<JpyTaskTrans> queryJpyTaskTran(Map<String, Object> queryMap);

}