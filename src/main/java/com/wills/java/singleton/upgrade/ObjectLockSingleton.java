package com.wills.java.singleton.upgrade;

/**
 * @author 王帅
 * @date 2021-03-13 14:40:48
 * @description:
 * 双重锁校验
 */
public class ObjectLockSingleton {

    private static ObjectLockSingleton singleton;

    private ObjectLockSingleton(){}

    public static ObjectLockSingleton getInstance(){
        if(null != singleton) return singleton;
        synchronized (ObjectLockSingleton.class){
            singleton = new ObjectLockSingleton();
            return singleton;
        }
    }
}
