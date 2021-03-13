package com.wills.java.singleton.upgrade;

/**
 * @author 王帅
 * @date 2021-03-13 14:22:00
 * @description:
 * 线程安全的单例模式 - 饿汉式
 */
public class HungrySingletonByThread {

    private static HungrySingletonByThread singleton = new HungrySingletonByThread();

    private HungrySingletonByThread(){}

    public static HungrySingletonByThread getInstance(){
        return singleton;
    }
}
