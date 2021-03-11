package com.wills.java.builder.common;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-11 11:25:50
 * @description:
 */
public interface Main {
    // 名称
    String name();
    // 品牌
    String brand();
    // 价格
    BigDecimal price();
    // 描述
    String desc();
}
