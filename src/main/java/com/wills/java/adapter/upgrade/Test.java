package com.wills.java.adapter.upgrade;

import com.alibaba.fastjson.JSON;
import com.wills.java.adapter.common.CreateUser;
import com.wills.java.adapter.common.Order;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 王帅
 * @date 2021-03-15 12:03:43
 * @description:
 */
public class Test {

    @org.junit.Test
    public void test() throws Exception {
        CreateUser createUser = new CreateUser();
        createUser.setCreateTime(new Date().toString());
        createUser.setUserName("隔壁老王呀！");
        createUser.setPwd(MessageDigest.getInstance("md5").digest("12345".getBytes()).toString());
        createUser.setType(1);

        // 定义转换的Map
        Map<String,String> link1 = new HashMap<>();
        link1.put("userId","userId");
        link1.put("bizTime","createTime");
        link1.put("name","userName");
        link1.put("type","type");
        link1.put("desc","pwd");

        RebateInfo filter = MQAdapter.filter(JSON.toJSONString(createUser), link1);
        System.out.println(filter);
        System.out.println("---------------------------------------------");
        Order order = new Order();
        order.setOrderId("123456");
        order.setOrderTime(new Date().toString());
        order.setPrice(new BigDecimal(7));
        order.setSku("df23tg4d");
        order.setSkuName("测试");

        // 定义转换的Map
        Map<String,String> link2 = new HashMap<>();
        link2.put("bizId","orderId");
        link2.put("bizTime","orderTime");
        link2.put("name","skuName");
        link2.put("type","sku");
        link2.put("desc","price");

        System.out.println(MQAdapter.filter(JSON.toJSONString(order), link2));
    }
}
