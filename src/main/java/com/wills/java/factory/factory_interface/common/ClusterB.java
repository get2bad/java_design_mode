package com.wills.java.factory.factory_interface.common;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @author 王帅
 * @date 2021-03-10 11:18:05
 * @description:
 * 集群b
 */
@Slf4j
public class ClusterB {

    public String get(String key){
        log.info("Redis获取数据{}",key);
        return Redis.getInstance().get(key);
    }

    public void set(String key,String value){
        log.info("Redis设置值{}:{}",key,value);
        Redis.getInstance().put(key,value);
    }

    public void setExpire(String key, String value, long timeExpire, TimeUnit timeUnit){
        log.info("Redis设置值{}:{},过期时间为:{},时间单位：{}",key,value,timeExpire,timeUnit.toString());
        Redis.getInstance().put(key,value);
    }

    public void del(String key){
        log.warn("Redis删除值：{}",key);
        Redis.getInstance().remove(key);
    }
}
