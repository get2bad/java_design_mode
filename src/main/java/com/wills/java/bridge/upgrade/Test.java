package com.wills.java.bridge.upgrade;

import com.wills.java.bridge.upgrade.pay.Pay;
import com.wills.java.bridge.upgrade.pay.impl.WxPay;
import com.wills.java.bridge.upgrade.pay.impl.ZfbPay;
import com.wills.java.bridge.upgrade.paymode.impl.FaceMode;
import com.wills.java.bridge.upgrade.paymode.impl.PayCodeMode;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author 王帅
 * @date 2021-03-16 13:30:55
 * @description:
 */
public class Test {

    @org.junit.Test
    public void test(){
        Pay wx = new WxPay(new PayCodeMode());
        wx.transfer("123", UUID.randomUUID().toString(),new BigDecimal(4.0));

        Pay ali = new ZfbPay(new FaceMode());
        ali.transfer("456",UUID.randomUUID().toString(),new BigDecimal(3.5));
    }
}
