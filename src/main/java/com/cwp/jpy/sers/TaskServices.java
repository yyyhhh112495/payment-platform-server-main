package com.cwp.jpy.sers;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;

public interface TaskServices {
    Object queryTaskByBusid(JSONObject jsonObject);
    Object optTasks(JSONObject jsonObject);
    Object queryTransByTranno(JSONObject jsonObject);
    Object optTransByTranno(JSONObject jsonObject);
    Object queryTableHeader(JSONObject jsonObject, HttpServletRequest request);
    Object queryTransRecords(JSONObject jsonObject);
    Object queryTransRecordsByBussid(JSONObject jsonObject);
    Object optJsTask(JSONObject jsonObject);
    Object queryTaskRet(JSONObject jsonObject);
}
