package com.wills.java.builder.simple;

import com.alibaba.fastjson.JSON;
import com.wills.java.common.entity.CommonResult;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-11 11:54:22
 * @description:
 */
@Slf4j
public class Test {

    @org.junit.Test
    public void test(){
        CommonResult result = new GoodsController().getMainList(1);
        log.info(result.toString());
    }
}
