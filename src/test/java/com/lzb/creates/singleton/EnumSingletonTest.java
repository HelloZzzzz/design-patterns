package com.lzb.creates.singleton;


import org.junit.Test;


/**
 * @Author : LZB
 * @Description :
 */

public class EnumSingletonTest {

    @Test
    public void test() {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;


        System.out.println("(instance1 == instance2) = " + (instance1 == instance2));

    }

}
