package com.wills.java.builder.common;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-11 11:23:45
 * @description:
 */
@Data
@ToString
public class DPaint implements Main{
    @Override
    public String name() {
        return "棕色亮晶晶油漆";
    }

    @Override
    public String brand() {
        return "多乐士";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(66.66);
    }

    @Override
    public String desc() {
        return "俺觉得👌！";
    }
}
