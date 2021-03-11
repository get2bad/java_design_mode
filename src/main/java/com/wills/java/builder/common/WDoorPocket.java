package com.wills.java.builder.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-11 11:22:04
 * @description:
 */
@Data
public class WDoorPocket implements Main{
    @Override
    public String name() {
        return "王老实门套";
    }

    @Override
    public String brand() {
        return "王老实";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(800);
    }

    @Override
    public String desc() {
        return "王老实门套，这小门套，嘎嘎好！";
    }
}
