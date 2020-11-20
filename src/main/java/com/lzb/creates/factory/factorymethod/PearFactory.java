package com.lzb.creates.factory.factorymethod;

import com.lzb.creates.factory.simplefactory.Fruit;
import com.lzb.creates.factory.simplefactory.Pear;

/**
 * @Author : LZB
 * @Description :
 */
public class PearFactory {

    public Fruit create() {
        return new Pear();
    }
}
