package com.wills.java.singleton.upgrade;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author 王帅
 * @date 2021-03-13 14:43:19
 * @description:
 * CAS  锁的方式实现 线程安全
 */
public class CASSingleton {

    private static final AtomicReference<CASSingleton> INSTANCE = new AtomicReference<>();

    private CASSingleton(){}

    public static final CASSingleton getInstance(){
        for (;;){
            CASSingleton singleton = INSTANCE.get();
            if(null != singleton) return singleton;
            INSTANCE.compareAndSet(null,new CASSingleton());
            return INSTANCE.get();
        }
    }
}
