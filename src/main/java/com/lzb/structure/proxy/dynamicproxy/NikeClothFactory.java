package com.lzb.structure.proxy.dynamicproxy;

/**
 * @Author : LZB
 * @Description :
 */
public class NikeClothFactory implements ClothFactory, Famous {

    @Override
    public void make() {
        System.out.println("这是nike工厂");
    }

    @Override
    public void show() {
        System.out.println("nike是名牌");
    }
}
