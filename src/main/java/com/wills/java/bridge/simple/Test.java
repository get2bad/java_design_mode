package com.wills.java.bridge.simple;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author 王帅
 * @date 2021-03-16 11:56:33
 * @description:
 */
public class Test {

    @org.junit.Test
    public void test() throws Exception {
        SimpleResolve pay = new SimpleResolve();
        pay.pay(2,1, UUID.randomUUID().toString(),new BigDecimal(4.0));
    }
}
