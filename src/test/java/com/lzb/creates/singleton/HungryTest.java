package com.lzb.creates.singleton;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * @Author : LZB
 * @Description :
 */

public class HungryTest {


    @Test
    public void getHungry() {
        Hungry hungry1 = Hungry.getHungry();
        Hungry hungry2 = Hungry.getHungry();
        System.out.println("(hungry1 == hungry2) = " + (hungry1 == hungry2));

    }
}
