package com.lzb.structure.adapter;

/**
 * @Author : LZB
 * @Description :适配器模式适用于 有相关性但不兼容的结构，
 * 源接口通过一个中间件转换后才可以适用于目标接口，这个转换过程就是适配，这个中间件就称之为适配器。
 */
public class Adapter {
    public static int convert(int volt) {
        return 5;
    }
}
