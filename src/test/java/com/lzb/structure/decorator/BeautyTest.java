package com.lzb.structure.decorator;


import org.junit.Test;

/**
 * @Author : LZB
 * @Description :
 */
public class BeautyTest {


    @Test
    public void getBeautyValue() {
        RingDecorator ringDecorator = new RingDecorator(new Me());
        System.out.println("ringDecorator.getBeautyValue() = " + ringDecorator.getBeautyValue());


        NecklaceDecorator necklaceDecorator = new NecklaceDecorator(new RingDecorator(new Me()));
        System.out.println("necklaceDecorator.getBeautyValue() = " + necklaceDecorator.getBeautyValue());

    }
}
