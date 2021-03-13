package com.wills.java.singleton.upgrade;

import java.util.Map;

/**
 * @author 王帅
 * @date 2021-03-13 14:15:29
 * @description:
 * 懒汉式 - 线程不安全
 */
public class LazySingletonByThreadless {

    private static LazySingletonByThreadless singleton;

    // 私有构造方法
    private LazySingletonByThreadless(){}

    public static LazySingletonByThreadless getInstance(){
        if(null != singleton) return singleton;
        singleton = new LazySingletonByThreadless();
        return singleton;
    }
}
