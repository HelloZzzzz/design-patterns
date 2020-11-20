package com.lzb.structure.proxy.staticproxy;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * @Author : LZB
 * @Description :
 */

public class PersonProxyTest {
    @Test
    public void test() {
        Person superman = new Superman();
        PersonProxy proxy = new PersonProxy(superman);
        proxy.eat();
        proxy.sleep();
    }
}
