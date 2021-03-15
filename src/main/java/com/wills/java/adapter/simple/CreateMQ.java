package com.wills.java.adapter.simple;

import com.alibaba.fastjson.JSON;
import com.wills.java.adapter.common.CreateUser;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-15 11:51:00
 * @description:
 */
@Slf4j
public class CreateMQ {

    public void onMessage(String message){
        CreateUser user = JSON.parseObject(message, CreateUser.class);
        // 处理相关的业务 ...
    }
}
