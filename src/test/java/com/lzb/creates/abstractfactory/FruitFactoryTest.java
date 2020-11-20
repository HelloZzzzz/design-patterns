package com.lzb.creates.abstractfactory;


import com.lzb.creates.factory.simplefactory.Fruit;
import org.junit.Test;

/**
 * @Author : LZB
 * @Description :
 */

public class FruitFactoryTest {


    @Test
    public void create() {
        FruitFactory factory = new AppleFactory();
        Fruit fruit = factory.create();
        System.out.println("fruit.getClass().getName() = " + fruit.getClass().getName());

    }
}
