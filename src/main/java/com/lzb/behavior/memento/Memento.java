package com.lzb.behavior.memento;

/**
 * @Author : LZB
 * @Description :备忘录模式：在不破坏封装的条件下，通过备忘录对象存储另外一个对象内部状态的快照，
 * 在将来合适的时候把这个对象还原到存储起来的状态。
 */
public class Memento {
    int life;
    int magic;

    Memento(int life, int magic) {
        this.life = life;
        this.magic = magic;
    }
}
