package com.wills.java.bridge.upgrade.pay.impl;

import com.wills.java.bridge.upgrade.pay.Pay;
import com.wills.java.bridge.upgrade.paymode.IPayMode;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-16 12:07:52
 * @description:
 */
@Slf4j
public class ZfbPay extends Pay {

    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        boolean security = payMode.security(uId);
        log.info("您的支付宝风控校验{}",security==true?"正常":"异常");
        if(!security){
            log.info("由于您的支付宝风控校验异常，本次操作被终止！");
            return "fail";
        }
        log.info("支付宝转账{}成功,账单编号{}！",amount,tradeId);
        return "success";
    }
}
