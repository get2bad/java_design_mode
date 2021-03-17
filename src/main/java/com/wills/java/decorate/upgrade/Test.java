package com.wills.java.decorate.upgrade;

import com.wills.java.decorate.common.SSOInterceptor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-17 11:46:52
 * @description:
 */
@Slf4j
public class Test {

    @org.junit.Test
    public void test(){
        LoginSSODecorator interceptor = new LoginSSODecorator(new SSOInterceptor());
        interceptor.operateOther();
        String header = "success:wang";
        log.info("登陆结果：{}",interceptor.preHandle(header,"login","x"));
    }
}
