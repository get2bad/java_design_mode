package com.wills.java.builder.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-11 11:22:04
 * @description:
 */
@Data
public class JDoorPocket implements Main{
    @Override
    public String name() {
        return "接盘侠门套";
    }

    @Override
    public String brand() {
        return "接盘侠";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(666.66);
    }

    @Override
    public String desc() {
        return "我就是接盘侠，我会好好对待他的孩子的！";
    }
}
