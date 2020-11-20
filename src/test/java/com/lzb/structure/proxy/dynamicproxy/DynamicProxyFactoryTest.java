package com.lzb.structure.proxy.dynamicproxy;


import org.junit.Test;

/**
 * @Author : LZB
 * @Description :
 */
public class DynamicProxyFactoryTest {

    @Test
    public void test() {
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ClothFactory clothFactory = (ClothFactory) DynamicProxyFactory.getProxyInstance(nikeClothFactory);
        Famous famous = (Famous) DynamicProxyFactory.getProxyInstance(nikeClothFactory);
        clothFactory.make();
        famous.show();
    }
}
