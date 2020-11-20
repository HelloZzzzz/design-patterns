package com.lzb.behavior.mediator;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * @Author : LZB
 * @Description :
 */

public class PlayerTest {
    @Test
    public void test() {
        Group group = new Group();
        Player player1 = new Player(group);
        Player player2 = new Player(group);
        Player player3 = new Player(group);
        Player player4 = new Player(group);
        // player1 赢了 5 元
        player1.change(5);
        // player2 赢了 20 元
        player2.change(20);
        // player3 输了 12 元
        player3.change(-12);
        // player4 输了 3 元
        player4.change(-3);

        // 输出：四人剩余的钱：105,120,88,97
        System.out.println("四人剩余的钱：" + player1.money + "," + player2.money + "," + player3.money + "," + player4.money);
    }


}
