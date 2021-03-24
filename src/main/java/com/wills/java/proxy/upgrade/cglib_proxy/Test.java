package com.wills.java.proxy.upgrade.cglib_proxy;

import com.wills.java.proxy.common.Saler;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-24 13:29:54
 * @description:
 */
public class Test {

    @org.junit.Test
    public void test(){
        Saler saler = new Saler("隔壁老王的爱心包裹❤️",new BigDecimal(4.00));
        Saler proxy = (Saler) new ProxyFactory(saler).getProxyInstance();
        proxy.sale();
    }
}
