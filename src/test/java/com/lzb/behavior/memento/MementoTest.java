package com.lzb.behavior.memento;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author : LZB
 * @Description :
 */

public class MementoTest {
    @Test
    public void test() {
        Player player = new Player();
        // 存档
        Memento memento = player.saveState();

        // 打 Boss，打不过，壮烈牺牲
        player.fightBoss();

        System.out.println("player.getLife() = " + player.getLife());
        System.out.println("player.getMagic() = " + player.getMagic());

        // 读档
        player.restoreState(memento);

        System.out.println("player.getLife() = " + player.getLife());
        System.out.println("player.getMagic() = " + player.getMagic());
    }

}
