package com.cwp.jpy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpyVerCode;
/**
*  @author author
*/
public interface JpyVerCodeBaseMapper {

    int insertJpyVerCode(JpyVerCode object);

    int updateJpyVerCode(JpyVerCode object);

    int update(JpyVerCode.UpdateBuilder object);

    List<JpyVerCode> queryJpyVerCode(JpyVerCode object);

    JpyVerCode queryJpyVerCodeLimit1(JpyVerCode object);

}