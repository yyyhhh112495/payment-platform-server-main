package com.cwp.jpy.mapper.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpyUser;
/**
*  @author author
*/
public interface JpyUserBaseMapper {

    int insertJpyUser(JpyUser object);

    int updateJpyUser(JpyUser object);

    int update(JpyUser.UpdateBuilder object);

    List<JpyUser> queryJpyUser(JpyUser object);

    JpyUser queryJpyUserLimit1(JpyUser object);

    List<Map<String, Object>> queryUserMenus(String userid);

}