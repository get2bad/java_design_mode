package com.wills.java.proxy.upgrade.static_proxy;

import com.wills.java.proxy.common.ISaler;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-24 12:03:47
 * @description:
 */
@Slf4j
public class SalerProxy implements ISaler {

    private ISaler saler;

    public SalerProxy(ISaler saler) {
        this.saler = saler;
    }

    @Override
    public void sale() {
        log.info("开始代理~！");
        saler.sale();
        log.info("代理完毕~！");
    }

    @Override
    public void hello(String str) {
        log.info("开始代理~！");
        saler.hello("老王");
        log.info("代理完毕~！");
    }
}
