package com.wills.java.decorate.common;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-17 11:17:18
 * @description:
 */
@Slf4j
public class SSOInterceptor implements Interceptor{
    @Override
    public boolean preHandle(String req, String resp, Object handler) {
        // 模拟拿到cookie / header
        String auth = req.substring(1, 8);
        return "success".equals(auth);
    }

    public void other(){
        log.info("SSO - Interceptor");
    }
}
