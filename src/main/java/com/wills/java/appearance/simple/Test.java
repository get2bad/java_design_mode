package com.wills.java.appearance.simple;

import com.wills.java.appearance.common.*;

/**
 * @author 王帅
 * @date 2021-03-22 11:51:21
 * @description:
 */
public class Test {

    @org.junit.Test
    public void test(){
        Screen screen = Screen.getInstance();
        Light light = Light.getInstance();
        Projector projector = Projector.getInstance();
        Speaker speaker = Speaker.getInstance();
        DVDPlayer dvdPlayer = DVDPlayer.getInstance();
        System.out.println("-----------------观影-----------------");
        screen.turnOn();
        projector.turnOn();
        speaker.turnOn();
        dvdPlayer.turnOn();
        dvdPlayer.choseDVD();
        light.turnDarker();
        dvdPlayer.play();
        dvdPlayer.turnOff();
        speaker.turnOff();
        projector.turnOff();
        screen.turnOff();
        light.turnLighter();
        System.out.println("--------------------------------------");

    }
}
