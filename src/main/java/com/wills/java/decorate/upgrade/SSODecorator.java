package com.wills.java.decorate.upgrade;

import com.wills.java.decorate.common.Interceptor;

/**
 * @author 王帅
 * @date 2021-03-17 11:35:20
 * @description:
 */
public abstract class SSODecorator implements Interceptor {

    private Interceptor interceptor;

    public SSODecorator() {
    }

    public SSODecorator(Interceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Override
    public boolean preHandle(String req, String resp, Object handler) {
        System.out.println("其他登陆前的操作");
        return interceptor.preHandle(req,resp,handler);
    }
}
