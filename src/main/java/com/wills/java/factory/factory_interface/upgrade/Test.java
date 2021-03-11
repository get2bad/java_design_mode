package com.wills.java.factory.factory_interface.upgrade;

import com.wills.java.factory.factory_interface.common.CacheService;
import com.wills.java.factory.factory_interface.simple.CacheServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-10 12:08:12
 * @description:
 */
@Slf4j
public class Test {

    @org.junit.Test
    public void test1() throws Exception{
        CacheService proxyClusterA = JDKProxy.getProxy(CacheServiceImpl.class,new ClusterAAdapter());
        proxyClusterA.set("author","王小懒☁️");

        CacheService proxyClusterB = JDKProxy.getProxy(CacheServiceImpl.class,new ClusterBAdapter());
        log.info(proxyClusterB.get("author"));
    }
}
