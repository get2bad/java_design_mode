package com.wills.java.prototype.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-12 11:52:35
 * @description:
 */
@Slf4j
public class Test {

    @org.junit.Test
    public void test(){
        SimpleSolution simpleSolution = new SimpleSolution();
        log.info("\r\n" + simpleSolution.examination("123456","隔壁的老王"));
    }
}
