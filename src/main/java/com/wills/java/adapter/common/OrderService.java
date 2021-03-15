package com.wills.java.adapter.common;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-15 11:46:55
 * @description:
 */
@Slf4j
public class OrderService {

    public Long getUserOrderCount(Integer userId){
        log.info("查询自营商家的订单数量:{}",userId);
        return 6L;
    }
}
