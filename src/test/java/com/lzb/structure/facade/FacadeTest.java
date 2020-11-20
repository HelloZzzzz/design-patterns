package com.lzb.structure.facade;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * @Author : LZB
 * @Description :外观模式:外部与一个子系统的通信必须通过一个统一的外观对象进行, 为好系统中的一组接口
 * 提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子 系统更加容易使用。
 * 外观模式又称为门面模式。
 */

public class FacadeTest {

    private Facade facade;


    @Before
    public void init() {
        facade = new Facade();
    }

    @Test
    public void open() {
        facade.open();
    }

    @Test
    public void close() {
        facade.close();
    }
}
