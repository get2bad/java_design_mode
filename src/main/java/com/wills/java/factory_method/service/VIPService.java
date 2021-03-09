package com.wills.java.factory_method.service;

/**
 * @author 王帅
 * @date 2021-03-09 11:23:12
 * @description:
 */
public class VIPService {

    public String sendGoods(String userId,String awardNumber){
        if("".equals(awardNumber)){
            return "发放VIP失败，奖品序列码不正确！";
        } else {
            return "发放VIP成功！";
        }
    }
}
