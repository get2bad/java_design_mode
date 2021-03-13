package com.wills.java.singleton.upgrade;

/**
 * @author 王帅
 * @date 2021-03-13 14:18:06
 * @description:
 * 线程安全的单例模式 - 懒汉模式
 */
public class LazySingletonByThread {

    private static LazySingletonByThread singleton;

    private LazySingletonByThread(){}

    public static synchronized LazySingletonByThread getInstance(){
        if(null != singleton) return singleton;
        singleton = new LazySingletonByThread();
        return singleton;
    }
}
