package com.lzb.creates.factory.simplefactory;

/**
 * @Author : LZB
 * @Description :
 */
public class FruitFactory {
    public Fruit create(String type) {
        switch (type) {
            case "苹果":
                return new Apple();
            case "梨子":
                return new Pear();
            default:
                throw new IllegalArgumentException("暂没有这种水果");
        }
    }
}
