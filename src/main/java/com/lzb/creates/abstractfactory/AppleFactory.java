package com.lzb.creates.abstractfactory;

import com.lzb.creates.factory.simplefactory.Apple;
import com.lzb.creates.factory.simplefactory.Fruit;

/**
 * @Author : LZB
 * @Description :
 */
public class AppleFactory implements FruitFactory {
    public Fruit create() {
//        AppleSeed appleSeed = new AppleSeed();
//        Sunlight sunlight = new Sunlight();
//        Water water = new Water();
        return new Apple();
    }
}
