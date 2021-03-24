package com.wills.java.proxy.common;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-24 11:59:29
 * @description:
 */
@Slf4j
public class Saler implements ISaler{

    private String prodName;
    private BigDecimal price;

    public Saler() {
    }

    public Saler(String prodName, BigDecimal price) {
        this.prodName = prodName;
        this.price = price;
    }

    @Override
    public void sale() {
      log.info("正在销售{}商品,价格为：{}~~~",prodName,price);
    }

    @Override
    public void hello(String str){
        log.info("向客人打招呼");
    }
}
