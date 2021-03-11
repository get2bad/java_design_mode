package com.wills.java.factory.factory_interface.upgrade;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author 王帅
 * @date 2021-03-10 11:54:48
 * @description:
 */
public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter iCacheAdapter;

    public JDKInvocationHandler(ICacheAdapter iCacheAdapter) {
        this.iCacheAdapter = iCacheAdapter;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(iCacheAdapter,args);
    }

    static class ClassLoaderUtils{
        public static Class<?>[] getClazzByArgs(Object[] args) {
            Class<?>[] parameterTypes = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                if (args[i] instanceof ArrayList) {
                    parameterTypes[i] = List.class;
                    continue;
                }
                if (args[i] instanceof LinkedList) {
                    parameterTypes[i] = List.class;
                    continue;
                }
                if (args[i] instanceof HashMap) {
                    parameterTypes[i] = Map.class;
                    continue;
                }
                if (args[i] instanceof Long){
                    parameterTypes[i] = long.class;
                    continue;
                }
                if (args[i] instanceof Double){
                    parameterTypes[i] = double.class;
                    continue;
                }
                if (args[i] instanceof TimeUnit){
                    parameterTypes[i] = TimeUnit.class;
                    continue;
                }
                parameterTypes[i] = args[i].getClass();
            }
            return parameterTypes;
        }
    }
}
