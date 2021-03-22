package com.wills.java.appearance.common;

/**
 * @author 王帅
 * @date 2021-03-22 11:38:10
 * @description:
 * 音响
 */
public class Speaker implements Equipment{

    private static Speaker speaker = new Speaker();

    private Speaker(){}

    public static Speaker getInstance(){
        return speaker;
    }

    @Override
    public void turnOn(){
        System.out.println("打开音响");
    }

    @Override
    public void turnOff(){
        System.out.println("关闭音响");
    }
}
