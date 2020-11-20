package com.lzb.structure.bridge;


import org.junit.Test;

/**
 * @Author : LZB
 * @Description :
 */

public class BridgeTest {

    @Test
    public void test() {
        Color yellow = new Yellow();
        Round round = new Round();
        round.setColor(yellow);
        round.draw();

        Color red = new Red();
        round.setColor(red);
        round.draw();


    }
}
