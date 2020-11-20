package com.lzb.creates.prototype;

import org.junit.Test;

/**
 * @Author : LZB
 * @Description :
 */
public class MilkTeaTest {

    @Test
    public void test() throws CloneNotSupportedException {
        MilkTea milkTea = new MilkTea("原味", "大", true);

        MilkTea myTea = milkTea.clone();
        MilkTea yourTea = milkTea;
        milkTea.setSize("小");
        System.out.println("milkTea = " + milkTea);
        System.out.println("myTea = " + myTea);
        System.out.println("yourTea = " + yourTea);

    }

}
