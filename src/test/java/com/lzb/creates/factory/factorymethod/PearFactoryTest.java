package com.lzb.creates.factory.factorymethod;


import com.lzb.creates.factory.simplefactory.Fruit;
import org.junit.Test;

/**
 * @Author : LZB
 * @Description :
 */

public class PearFactoryTest {


    @Test
    public void create() {
        PearFactory factory = new PearFactory();
        Fruit fruit = factory.create();
        System.out.println("fruit.getClass().getName() = " + fruit.getClass().getName());

    }
}
