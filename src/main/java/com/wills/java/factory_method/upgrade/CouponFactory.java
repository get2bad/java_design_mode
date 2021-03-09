package com.wills.java.factory_method.upgrade;

import com.wills.java.common.entity.AwardReq;

/**
 * @author 王帅
 * @date 2021-03-09 11:49:06
 * @description:
 */
public class CouponFactory implements Factory{


    @Override
    public String sendAward(AwardReq req) throws Exception {
        if("".equals(req.getAwardNumber())){
            return "发放奖品失败，奖品序列码不正确！";
        } else {
            return "发送奖品成功！";
        }
    }
}
