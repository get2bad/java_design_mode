package com.wills.java.factory.factory_interface.upgrade;

import java.util.concurrent.TimeUnit;

/**
 * @author 王帅
 * @date 2021-03-10 11:48:46
 * @description:
 * 适配接口
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
