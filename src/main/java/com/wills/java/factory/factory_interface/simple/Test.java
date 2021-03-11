package com.wills.java.factory.factory_interface.simple;

import com.wills.java.factory.factory_interface.common.CacheService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-10 11:36:58
 * @description:
 */
@Slf4j
public class Test {

    @org.junit.Test
    public void test1(){
        CacheService service1 = new CacheServiceImpl(1);
        service1.set("author","王小懒☁️");

        CacheService service2 = new CacheServiceImpl(2);
        log.info(service1.get("author"));

        CacheService service3 = new CacheServiceImpl(3);
        service3.del("author");
    }
}
