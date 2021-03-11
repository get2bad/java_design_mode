package com.wills.java.builder.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-11 11:23:45
 * @description:
 */
@Data
public class YPaint implements Main{
    @Override
    public String name() {
        return "棕色哑光油漆";
    }

    @Override
    public String brand() {
        return "雅力士";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(88.88);
    }

    @Override
    public String desc() {
        return "好！👌";
    }
}
