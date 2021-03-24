package com.wills.java.proxy.upgrade.cglib_proxy;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 王帅
 * @date 2021-03-24 13:26:27
 * @description:
 */
@Slf4j
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        log.info("JDK开始代理卖货咯~");
        // 执行原本类的方法
        Object invoke = method.invoke(target, args);
        log.info("JDK结束代理卖货咯~");
        return invoke;
    }
}
