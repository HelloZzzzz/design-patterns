package com.lzb.structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author : LZB
 * @Description :
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass().getName());
        Object invoke = method.invoke(object, args);
        System.out.println("AOP基础");
        return invoke;
    }
}
