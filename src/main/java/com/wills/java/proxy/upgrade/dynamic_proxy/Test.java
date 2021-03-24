package com.wills.java.proxy.upgrade.dynamic_proxy;

import com.wills.java.proxy.common.ISaler;
import com.wills.java.proxy.common.Saler;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-24 13:11:25
 * @description:
 */
public class Test {

    @org.junit.Test
    public void test(){
        ISaler saler = new Saler("隔壁老王的爱心包裹❤️",new BigDecimal(4.00));
        ISaler proxy = (ISaler)new ProxyFactory(saler).getProxyInstance();
        proxy.sale();
    }
}
