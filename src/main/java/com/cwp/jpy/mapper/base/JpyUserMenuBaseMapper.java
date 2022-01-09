package com.cwp.jpy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cwp.jpy.model.JpyUserMenu;
/**
*  @author author
*/
public interface JpyUserMenuBaseMapper {

    int insertJpyUserMenu(JpyUserMenu object);

    int updateJpyUserMenu(JpyUserMenu object);

    int update(JpyUserMenu.UpdateBuilder object);

    List<JpyUserMenu> queryJpyUserMenu(JpyUserMenu object);

    JpyUserMenu queryJpyUserMenuLimit1(JpyUserMenu object);

}