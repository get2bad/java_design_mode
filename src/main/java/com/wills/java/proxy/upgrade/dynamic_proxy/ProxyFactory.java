package com.wills.java.proxy.upgrade.dynamic_proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 王帅
 * @date 2021-03-24 13:08:36
 * @description:
 */
@Slf4j
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                log.info("JDK开始代理卖货咯~");
                // 执行原本类的方法
                Object invoke = method.invoke(target, args);
                log.info("JDK结束代理卖货咯~");
                return invoke;
            }
        });
    }
}
