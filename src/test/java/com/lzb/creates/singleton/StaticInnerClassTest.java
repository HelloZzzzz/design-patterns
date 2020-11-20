package com.lzb.creates.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * @Author : LZB
 * @Description :
 */

public class StaticInnerClassTest {


    @Test
    public void getStaticInnerClass() {
        StaticInnerClass staticInnerClass1 = StaticInnerClass.getStaticInnerClass();
        StaticInnerClass staticInnerClass2 = StaticInnerClass.getStaticInnerClass();
        System.out.println("(staticInnerClass1 == staticInnerClass2) = " + (staticInnerClass1 == staticInnerClass2));


    }
}
