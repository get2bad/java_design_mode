package com.wills.java.factory.factory_interface.common;

import java.util.concurrent.TimeUnit;

/**
 * @author 王帅
 * @date 2021-03-10 11:23:30
 * @description:
 */
public interface CacheService {

    String get(String key);

    void set(String key,String value);

    void set(String key, String value, long timeExpire, TimeUnit timeUnit);

    void del(String key);
}
