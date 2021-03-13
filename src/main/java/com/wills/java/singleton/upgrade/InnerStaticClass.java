package com.wills.java.singleton.upgrade;

/**
 * @author 王帅
 * @date 2021-03-13 14:28:46
 * @description:
 * 静态内部类 单例模式
 */
public class InnerStaticClass {

    private InnerStaticClass(){}

    private static class Instance{
        private static InnerStaticClass instance = new InnerStaticClass();
    }

    public static InnerStaticClass getInstance(){
        return Instance.instance;
    }
}
