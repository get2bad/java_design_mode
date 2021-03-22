package com.wills.java.appearance.common;

/**
 * @author 王帅
 * @date 2021-03-22 11:36:56
 * @description:
 * 投影仪
 */
public class Projector implements Equipment{

    // 使用饿汉式单例模式
    private static Projector projector = new Projector();

    private Projector(){}

    public static Projector getInstance(){
        return projector;
    }

    @Override
    public void turnOn(){
        System.out.println("开启投影仪");
    }

    @Override
    public void turnOff(){
        System.out.println("关闭投影仪");
    }
}
