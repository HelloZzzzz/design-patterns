package com.lzb.creates.abstractfactory;

import com.lzb.creates.factory.simplefactory.Fruit;
import com.lzb.creates.factory.simplefactory.Pear;

/**
 * @Author : LZB
 * @Description :
 */
public class PearFactory implements FruitFactory {

    public Fruit create() {
        return new Pear();
    }
}
