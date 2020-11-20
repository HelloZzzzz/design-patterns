package com.lzb.creates.singleton;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * @Author : LZB
 * @Description :
 */

public class DoubleCheckTest {


    @Test
    public void getDoubleCheck() {
        DoubleCheck doubleCheck1 = DoubleCheck.getDoubleCheck();
        DoubleCheck doubleCheck2 = DoubleCheck.getDoubleCheck();
        System.out.println("(doubleCheck1 == doubleCheck2) = " + (doubleCheck1 == doubleCheck2));
    }
}
