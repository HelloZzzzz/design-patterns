package com.lzb.structure.decorator;

/**
 * @Author : LZB
 * @Description :
 */
public class MyHouse implements House {
    @Override
    public void living() {
        System.out.println("居住");
    }
}
