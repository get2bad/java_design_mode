package com.wills.java.builder.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-11 11:22:20
 * @description:
 */
@Data
public class ZDoor implements Main{
    @Override
    public String name() {
        return "中式奢华静音门";
    }

    @Override
    public String brand() {
        return "中华";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(3600);
    }

    @Override
    public String desc() {
        return "中式的奢华们不香么，兄弟们！";
    }
}
