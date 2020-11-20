package com.lzb.structure.decorator;


import org.junit.Test;

/**
 * @Author : LZB
 * @Description :
 */

public class VillaTest {


    @Test
    public void swimming() {
        House house = new MyHouse();
        house.living();


        Villa villa = new MyVilla(house);
        villa.living();
        villa.swimming();

    }
}
