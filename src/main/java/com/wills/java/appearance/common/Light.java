package com.wills.java.appearance.common;

/**
 * @author 王帅
 * @date 2021-03-22 11:42:03
 * @description:
 * 灯光
 */
public class Light implements Equipment{

    private static Light light = new Light();

    private Light(){}

    public static Light getInstance(){
        return light;
    }

    @Override
    public void turnOn(){
        System.out.println("开灯");
    }

    public void turnDarker(){
        System.out.println("调暗灯光");
    }

    public void turnLighter(){
        System.out.println("调亮灯光");
    }

    @Override
    public void turnOff(){
        System.out.println("关灯");
    }
}
