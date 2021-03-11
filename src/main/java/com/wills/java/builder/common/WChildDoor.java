package com.wills.java.builder.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 王帅
 * @date 2021-03-11 11:22:25
 * @description:
 */
@Data
public class WChildDoor implements Main{
    @Override
    public String name() {
        return "简约子门";
    }

    @Override
    public String brand() {
        return "隔壁小王";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(1200);
    }

    @Override
    public String desc() {
        return "隔壁小王牌，质量顶呱呱";
    }
}
