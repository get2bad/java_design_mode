package com.wills.java.builder.simple;

import com.wills.java.builder.common.*;
import com.wills.java.common.entity.CommonResult;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 王帅
 * @date 2021-03-11 11:44:50
 * @description:
 */
public class GoodsController {

    public CommonResult getMainList(Integer level){
        if(level == null) return CommonResult.faild();

        Map<String,Object> res = new HashMap<>();

        List<Main> goodsList = new ArrayList<>();
        BigDecimal price = BigDecimal.ZERO;

        if(level == 1){
            // 欧式轻奢门
            ODoor oDoor = new ODoor();
            JDoorPocket jDoorPocket = new JDoorPocket();
            DPaint dPaint = new DPaint();
            HChildDoor hChildDoor = new HChildDoor();

            goodsList.add(oDoor);
            goodsList.add(jDoorPocket);
            goodsList.add(dPaint);
            goodsList.add(hChildDoor);

            price = price.add(oDoor.price()).add(jDoorPocket.price()).add(dPaint.price()).add(hChildDoor.price());
        }

        if(level == 2){
            // 中式奢华们
            ZDoor zDoor = new ZDoor();
            WDoorPocket wDoorPocket = new WDoorPocket();
            WChildDoor wChildDoor = new WChildDoor();
            YPaint yPaint = new YPaint();

            goodsList.add(zDoor);
            goodsList.add(wDoorPocket);
            goodsList.add(wChildDoor);
            goodsList.add(yPaint);

            price = price.add(zDoor.price()).add(wDoorPocket.price()).add(yPaint.price()).add(wChildDoor.price());
        }

        if(level == 3){
            // 套餐 1
            ODoor oDoor = new ODoor();
            WDoorPocket wDoorPocket = new WDoorPocket();
            YPaint yPaint = new YPaint();
            WChildDoor wChildDoor = new WChildDoor();

            goodsList.add(oDoor);
            goodsList.add(wDoorPocket);
            goodsList.add(wChildDoor);
            goodsList.add(yPaint);

            price = price.add(oDoor.price()).add(wDoorPocket.price()).add(yPaint.price()).add(wChildDoor.price());
        }
        StringBuilder sb = new StringBuilder();
        goodsList.stream().forEach(data -> {
            sb.append("\r\n商品：" + data.brand() + ":" + data.name() + ":" + data.desc());
        });
        res.put("goods",sb);
        res.put("price", price.setScale(2,BigDecimal.ROUND_HALF_UP));
        return CommonResult.ok(res);
    }
}
