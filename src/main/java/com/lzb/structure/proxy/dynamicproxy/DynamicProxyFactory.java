package com.lzb.structure.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @Author : LZB
 * @Description :
 */
public class DynamicProxyFactory {
    public static Object getProxyInstance(Object object) {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setObject(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), myInvocationHandler);
//        Class<?> proxyClass = Proxy.getProxyClass(object.getClass().getClassLoader(), ClothFactory.class);

    }
}
