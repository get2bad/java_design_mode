package com.wills.java.appearance.common;

/**
 * @author 王帅
 * @date 2021-03-22 11:53:42
 * @description:
 */
public class DVDPlayer implements Equipment{

    private static DVDPlayer dvdPlayer = new DVDPlayer();

    private DVDPlayer(){}

    public static DVDPlayer getInstance(){
        return dvdPlayer;
    }

    @Override
    public void turnOn(){
        System.out.println("打开DVD播放机");
    }

    public void choseDVD(){
        System.out.println("挑选DVD");
    }

    public void play(){
        System.out.println("播放DVD");
    }

    @Override
    public void turnOff(){
        System.out.println("关闭DVD播放机");
    }
}
