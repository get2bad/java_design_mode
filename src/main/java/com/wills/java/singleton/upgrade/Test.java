package com.wills.java.singleton.upgrade;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 王帅
 * @date 2021-03-13 14:49:42
 * @description:
 */
public class Test {

    @org.junit.Test
    public void testStaticSingleton(){
        System.out.println(StaticSingleton.data);
        System.out.println(StaticSingleton.data);
    }

    @org.junit.Test
    public void testLazySingletonByThreadless(){
        System.out.println(LazySingletonByThreadless.getInstance());
        System.out.println(LazySingletonByThreadless.getInstance());
    }

    @org.junit.Test
    public void testLazySingletonByThread(){
        System.out.println(LazySingletonByThread.getInstance());
        System.out.println(LazySingletonByThread.getInstance());
    }

    @org.junit.Test
    public void testHungrySingletonByThread(){
        System.out.println(HungrySingletonByThread.getInstance());
        System.out.println(HungrySingletonByThread.getInstance());
    }

    @org.junit.Test
    public void testInnerStaticClass(){
        System.out.println(InnerStaticClass.getInstance());
        System.out.println(InnerStaticClass.getInstance());
    }

    @org.junit.Test
    public void testObjectLockSingleton(){
        System.out.println(ObjectLockSingleton.getInstance());
        System.out.println(ObjectLockSingleton.getInstance());
    }

    @org.junit.Test
    public void testCASSingleton(){
        System.out.println(CASSingleton.getInstance());
        System.out.println(CASSingleton.getInstance());
    }

    @org.junit.Test
    public void testEnum(){
        System.out.println(EnumSingleton.INSTANCE.getInstance());
        System.out.println(EnumSingleton.INSTANCE.getInstance());
    }
}
