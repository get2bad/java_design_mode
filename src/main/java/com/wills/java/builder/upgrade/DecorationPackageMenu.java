package com.wills.java.builder.upgrade;

import com.wills.java.builder.common.Main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 王帅
 * @date 2021-03-11 13:35:25
 * @description:
 */
public class DecorationPackageMenu implements IMenu{

    private List<Main> list = new ArrayList<Main>(); // 套餐清单
    private BigDecimal price = BigDecimal.ZERO; // 套餐价格

    private Integer packetId;

    public DecorationPackageMenu(Integer packetId) {
        this.packetId = packetId;
    }

    @Override
    public IMenu appendDoor(Main door) {
        list.add(door);
        price = price.add(door.price());
        return this;
    }

    @Override
    public IMenu appendChildDoor(Main childDoor) {
        list.add(childDoor);
        price = price.add(childDoor.price());
        return this;
    }

    @Override
    public IMenu appendDoorPocket(Main doorPocket) {
        list.add(doorPocket);
        price = price.add(doorPocket.price());
        return this;
    }

    @Override
    public IMenu appendPaint(Main paint) {
        list.add(paint);
        price = price.add(paint.price());
        return this;
    }

    @Override
    public String getDetail(){
        StringBuilder sb = new StringBuilder();
        sb.append("\r\n----------套餐" + this.packetId +"-------------\r\n");
        sb.append("总价：" + this.price.setScale(2,BigDecimal.ROUND_HALF_UP) + "\r\n");
        for (Main main : list) {
            sb.append("商品：" + main.brand());
            sb.append("名称：" + main.name());
            sb.append("价格：" + main.price().setScale(2,BigDecimal.ROUND_HALF_UP));
            sb.append("介绍：" + main.desc());
        }
        sb.append("\r\n-------------------------------------------------\r\n");
        return sb.toString();
    }
}
