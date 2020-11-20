package com.lzb.creates.factory.simplefactory;

import org.junit.Test;

/**
 * @Author : LZB
 * @Description :
 */
public class FruitFactoryTest {


    @Test
    public void create() {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit fruit = fruitFactory.create("苹果");
        //com.lzb.create.simplefactory.Apple
        System.out.println("fruit.getClass().getName() = " + fruit.getClass().getName());
    }
}
