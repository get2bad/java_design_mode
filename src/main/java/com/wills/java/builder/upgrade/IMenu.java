package com.wills.java.builder.upgrade;

import com.wills.java.builder.common.Main;

/**
 * @author 王帅
 * @date 2021-03-11 13:32:45
 * @description:
 * 建造的接口类
 */
public interface IMenu {

    // 门
    IMenu appendDoor(Main door);
    // 子门
    IMenu appendChildDoor(Main childDoor);
    // 门套
    IMenu appendDoorPocket(Main doorPocket);
    // 油漆
    IMenu appendPaint(Main paint);

    String getDetail();
}
