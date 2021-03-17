package com.wills.java.decorate.common;

/**
 * @author 王帅
 * @date 2021-03-17 11:16:01
 * @description:
 */
public interface Interceptor {

    boolean preHandle(String req,String resp,Object handler);
}
