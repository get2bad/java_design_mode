package com.wills.java.factory.factory_method.service;

/**
 * @author 王帅
 * @date 2021-03-09 11:03:55
 * @description:
 */
public class GoodsService {

    public String sendGoods(String userId,String awardNumber){
        if("".equals(awardNumber)){
            return "发放商品失败，奖品序列码不正确！";
        } else {
            return "发送商品成功！";
        }
    }
}
