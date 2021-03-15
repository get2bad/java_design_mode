package com.wills.java.adapter.upgrade;

import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * @author 王帅
 * @date 2021-03-15 11:58:04
 * @description:
 */
public class MQAdapter {

    public static RebateInfo filter(String strJson, Map<String, String>
            link) throws Exception{
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link)
            throws Exception{
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            if(val == null) continue;
            RebateInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class)
                    .invoke(rebateInfo, val.toString());
        }
        return rebateInfo;
    }
}