package com.wills.java.appearance.upgrade;

import com.wills.java.appearance.common.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-22 12:01:26
 * @description:
 */
@Slf4j
public class HomePlayFace {

    private DVDPlayer dvdPlayer;
    private Light light;
    private Projector projector;
    private Screen screen;
    private Speaker speaker;

    public HomePlayFace() {
        dvdPlayer = DVDPlayer.getInstance();
        light = Light.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
        speaker = Speaker.getInstance();
    }

    public void ready(){
        log.info("---------------设备准备-------------------");
        screen.turnOn();
        projector.turnOn();
        speaker.turnOn();
        dvdPlayer.turnOn();
        dvdPlayer.choseDVD();
        light.turnDarker();
        log.info("----------------------------------------");
    }

    public void play(){
        log.info("---------------开始放映-------------------");
        dvdPlayer.play();
        log.info("----------------------------------------");
    }

    public void stop(){
        log.info("---------------结束放映-------------------");
        dvdPlayer.turnOff();
        speaker.turnOff();
        projector.turnOff();
        screen.turnOff();
        light.turnLighter();
        log.info("----------------------------------------");
    }
}
