package com.lzb.structure.decorator;

/**
 * @Author : LZB
 * @Description :由于没有改变接口，也没有新增方法,这种装饰模式称之为 透明装饰模式，所以透明装饰模式可以无限装饰。
 */
public interface Beauty {
    int getBeautyValue();
}
