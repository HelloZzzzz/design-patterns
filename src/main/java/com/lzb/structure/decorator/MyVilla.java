package com.lzb.structure.decorator;

/**
 * @Author : LZB
 * @Description :用于新增功能的装饰模式,这种模式在装饰模式中称之为半透明装饰模式。
 */
public class MyVilla implements Villa {
    private House house;

    public MyVilla(House house) {
        this.house = house;
    }

    @Override
    public void living() {
        house.living();
    }


    @Override
    public void swimming() {
        System.out.println("游泳");
    }
}
