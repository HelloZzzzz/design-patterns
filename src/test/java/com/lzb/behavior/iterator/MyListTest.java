package com.lzb.behavior.iterator;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * @Author : LZB
 * @Description :
 */

public class MyListTest {

    @Test
    public void test() {
        MyList list = new MyList();
        // 输出：abc
        for (String item : list) {
            System.out.print(item);
        }
    }
}
