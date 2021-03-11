package com.wills.java.factory.factory_interface.common;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @author 王帅
 * @date 2021-03-10 11:18:00
 * @description:
 * 集群A
 */
@Slf4j
public class ClusterA {

    public String gain(String key){
        log.info("Redis获取数据{}",key);
        return Redis.getInstance().get(key);
    }

    public void set(String key,String value){
        log.info("Redis设置值{}:{}",key,value);
        Redis.getInstance().put(key,value);
    }

    public void setEx(String key, String value, long timeExpire, TimeUnit timeUnit){
        log.info("Redis设置值{}:{},过期时间为:{},时间单位：{}",key,value,timeExpire,timeUnit.toString());
        Redis.getInstance().put(key,value);
    }

    public void delete(String key){
        log.warn("Redis删除值：{}",key);
        Redis.getInstance().remove(key);
    }
}
