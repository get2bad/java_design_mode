package com.wills.java.bridge.simple;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-16 11:51:01
 * @description:
 */
@Slf4j
public class SimpleResolve {

    public boolean pay(Integer payType, Integer modeType, String tradeId, BigDecimal price) throws Exception {
        // 微信支付
        if(1 == payType){
            if(1 == modeType){
                // 扫码支付
                log.info("{}扫码支付","微信");
            } else if(2 == modeType){
                // 刷脸支付
                log.info("{}刷脸支付","微信");
            } else if(3 == modeType){
                // 付款码支付
                log.info("{}付款码支付","微信");
            } else {
                throw new Exception("未知支付方式");
            }
        } else if(2 == payType){
            // 支付宝支付
            if(1 == modeType){
                // 扫码支付
                log.info("{}扫码支付","支付宝");
            } else if(2 == modeType){
                // 刷脸支付
                log.info("{}刷脸支付","支付宝");
            } else if(3 == modeType){
                // 付款码支付
                log.info("{}付款码支付","支付宝");
            } else {
                throw new Exception("未知支付方式");
            }
        }
        return true;
    }
}
