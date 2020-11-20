package com.lzb.creates.builder;


import org.junit.Test;

/**
 * @Author : LZB
 * @Description :
 */
public class MilkTeaTest {

    @Test
    public void buildTest() {
        MilkTea build = new MilkTea.MilkTeaBuilder("原味").ice(true).build();
        System.out.println("build = " + build);
    }

}
