package com.wills.java.decorate.simple;

import com.wills.java.decorate.common.Interceptor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-17 11:25:17
 * @description:
 */
@Slf4j
public class Test {

    @org.junit.Test
    public void test(){
        Interceptor interceptor = new NewSSOInterceptor();
        String header = "success:wang";
        log.info("登陆结果：{}",interceptor.preHandle(header,"login","x"));
    }
}
