package com.wills.java.bridge.upgrade.paymode.impl;

import com.wills.java.bridge.upgrade.paymode.IPayMode;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-16 13:27:02
 * @description:
 */
@Slf4j
public class FaceMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        log.info("{}进行了刷脸支付",uId);
        return true;
    }
}
