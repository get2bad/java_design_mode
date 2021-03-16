package com.wills.java.bridge.upgrade.pay;

import com.wills.java.bridge.upgrade.paymode.IPayMode;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-16 12:02:26
 * @description:
 */
@Slf4j
public abstract class Pay {

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal
            amount);
}
