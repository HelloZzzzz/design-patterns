package com.lzb.structure.adapter;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * @Author : LZB
 * @Description :
 */
public class AdapterTest {

    @Test
    public void convert() {
        USBLine line = new USBLine();

        line.charge(Adapter.convert(HomeBattery.supply()));

        line.charge(HomeBattery.supply());


    }
}
