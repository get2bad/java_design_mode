package com.wills.java.appearance.upgrade;

/**
 * @author 王帅
 * @date 2021-03-22 12:06:06
 * @description:
 */
public class Test {

    @org.junit.Test
    public void test(){
        HomePlayFace face = new HomePlayFace();
        face.ready();
        face.play();
        face.stop();
    }
}
