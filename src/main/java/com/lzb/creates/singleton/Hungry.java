package com.lzb.creates.singleton;


import java.io.ObjectStreamException;

/**
 * @Author : LZB
 * @Description :
 */
public class Hungry {
    private static final Hungry hungry = new Hungry();

    private Hungry() {
        System.out.println("初始化");
        if (null != hungry) {
            throw new RuntimeException();
        }
    }

    private Object readResolve() throws ObjectStreamException {
        return hungry;
    }

    public static Hungry getHungry() {
        return hungry;
    }

}
