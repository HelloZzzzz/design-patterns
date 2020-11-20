package com.lzb.structure.proxy.staticproxy;

/**
 * @Author : LZB
 * @Description :
 */
public class Superman implements Person {
    @Override
    public void eat() {
        System.out.println("超人不用吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("超人不用吃饭");
    }
}
