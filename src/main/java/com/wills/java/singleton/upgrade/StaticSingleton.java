package com.wills.java.singleton.upgrade;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王帅
 * @date 2021-03-13 14:09:17
 * @description:
 */
public class StaticSingleton {

    public static StaticSingleton data = new StaticSingleton();

    private StaticSingleton(){}
}
