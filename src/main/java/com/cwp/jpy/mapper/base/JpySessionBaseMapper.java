package com.cwp.jpy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpySession;
/**
*  @author author
*/
public interface JpySessionBaseMapper {

    int insertJpySession(JpySession object);

    int updateJpySession(JpySession object);

    int update(JpySession.UpdateBuilder object);

    List<JpySession> queryJpySession(JpySession object);

    JpySession queryJpySessionLimit1(JpySession object);

    int deleteUserSession(int userid);

}