package com.wills.java.builder.upgrade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-11 13:46:29
 * @description:
 */
@Slf4j
public class Test {

    @org.junit.Test
    public void test(){
        Builder builder = new Builder();
        log.info(builder.level1().getDetail());
    }
}
