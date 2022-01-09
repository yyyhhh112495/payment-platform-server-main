package com.cwp.jpy.sers;

import com.alibaba.fastjson.JSONObject;

public interface UserServices {
      Object userLogin(JSONObject jsonObject);
      Object getVerPic(JSONObject jsonObject);
      Object queryOrgInfo(JSONObject jsonObject);
      Object optOrgInfo(JSONObject jsonObject);

      Object queryCountInfo(JSONObject jsonObject);
      Object optCountInfo(JSONObject jsonObject);

      Object queryTaskInfo(JSONObject jsonObject);

      Object querTransInfo(JSONObject jsonObject);

      Object restPasswd(JSONObject jsonObject);
      Object chgPasswd (JSONObject jsonObject);
      Object userExit(JSONObject jsonObject);

}
