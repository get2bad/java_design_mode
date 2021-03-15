package com.wills.java.adapter.common;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 王帅
 * @date 2021-03-15 11:43:31
 * @description:
 */
@Data
public class Order {

    private String orderId;
    private Integer uid;
    private String orderTime;
    private String sku;
    private String skuName;
    private BigDecimal price;
}
