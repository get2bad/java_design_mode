package com.wills.java.appearance.common;

/**
 * @author 王帅
 * @date 2021-03-22 11:35:12
 * @description:
 * 屏幕
 */
public class Screen implements Equipment{

    private static Screen screen = new Screen();

    private Screen(){}

    public static Screen getInstance(){
        return screen;
    }

    @Override
    public void turnOn(){
        System.out.println("放下投影仪");
    }

    @Override
    public void turnOff(){
        System.out.println("拉起投影仪");
    }
}
