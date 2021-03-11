package com.wills.java.builder.upgrade;

import com.wills.java.builder.common.*;

/**
 * @author 王帅
 * @date 2021-03-11 13:43:51
 * @description:
 * 建造套餐
 */
public class Builder {

    public IMenu level1(){
        return new DecorationPackageMenu(1)
                .appendDoor(new ODoor())
                .appendChildDoor(new WChildDoor())
                .appendDoorPocket(new JDoorPocket())
                .appendPaint(new YPaint());
    }

    public IMenu level2(){
        return new DecorationPackageMenu(2)
                .appendDoor(new ZDoor())
                .appendChildDoor(new WChildDoor())
                .appendDoorPocket(new WDoorPocket())
                .appendPaint(new YPaint());
    }

    public IMenu level3(){
        return new DecorationPackageMenu(3)
                .appendDoor(new ODoor())
                .appendChildDoor(new HChildDoor())
                .appendDoorPocket(new JDoorPocket())
                .appendPaint(new YPaint());
    }

    public IMenu level4(){
        return new DecorationPackageMenu(4)
                .appendDoor(new ODoor())
                .appendChildDoor(new WChildDoor())
                .appendDoorPocket(new JDoorPocket())
                .appendPaint(new DPaint());
    }
}
