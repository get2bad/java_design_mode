package com.wills.java.factory.factory_method.service;

/**
 * @author 王帅
 * @date 2021-03-09 11:00:26
 * @description:
 */
public class CouponService {

    public String sendCoupon(String userId,String awardNumber){
        if("".equals(awardNumber)){
            return "发放奖品失败，奖品序列码不正确！";
        } else {
            return "发送奖品成功！";
        }
    }
}
