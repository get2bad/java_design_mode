package com.wills.java.builder.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-11 11:22:25
 * @description:
 */
@Data
public class HChildDoor implements Main{
    @Override
    public String name() {
        return "哈哈子门";
    }

    @Override
    public String brand() {
        return "哈哈";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(333);
    }

    @Override
    public String desc() {
        return "哈哈哈哈哈哈哈哈哈哈哈";
    }
}
