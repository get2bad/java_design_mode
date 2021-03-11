package com.wills.java.builder.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-11 11:22:20
 * @description:
 */
@Data
public class ODoor implements Main{
    @Override
    public String name() {
        return "欧式轻奢静音门";
    }

    @Override
    public String brand() {
        return "隔壁老王";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(3400);
    }

    @Override
    public String desc() {
        return "奢华的欧式风格静音门，让您在静谧的生活中享受不一样的感觉";
    }
}
