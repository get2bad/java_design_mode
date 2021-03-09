package com.wills.java.common.util;

import java.util.UUID;

/**
 * @author 王帅
 * @date 2021-03-09 11:19:52
 * @description:
 */
public class UUIDGenerate {

    public static String generateStr(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
