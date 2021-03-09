package com.wills.java.factory_method.upgrade;

import com.wills.java.factory_method.service.GoodsService;

/**
 * @author 王帅
 * @date 2021-03-09 11:52:49
 * @description:
 */
public class FactoryStore {

    public Factory getFactoryService(Integer awardType){
        if(awardType == null) return null;
        if(awardType == 1) return new CouponFactory();
        if(awardType == 2) return new GoodsFactory();
        if(awardType == 3) return new VIPFactory();
        throw new RuntimeException("不存在的奖品类型！");
    }
}
