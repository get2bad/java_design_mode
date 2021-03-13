package com.wills.java.singleton.upgrade;

import com.wills.java.singleton.common.TestObject;

/**
 * @author 王帅
 * @date 2021-03-13 15:09:39
 * @description:
 */
public enum EnumSingleton {

    INSTANCE;

    private static TestObject instance = new TestObject();

    public TestObject getInstance(){
        return instance;
    }
}
