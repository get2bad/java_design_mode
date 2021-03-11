package com.wills.java.factory.factory_interface.common;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 王帅
 * @date 2021-03-10 11:08:06
 * @description:
 * 单例模式 Redis 存储服务，模拟Redis环境
 *
 * 为了方便，我们直接使用 饿汉式，直接创建对象
 */
public class Redis {

    // 私有化构造方法
    private Redis(){}

    // 线程安全的 ConcurrentHashMap
    private final static Map<String,String> data = new ConcurrentHashMap<>();

    public static Map<String,String> getInstance(){
        return data;
    }
}
