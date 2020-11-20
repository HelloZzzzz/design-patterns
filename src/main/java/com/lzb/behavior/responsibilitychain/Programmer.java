package com.lzb.behavior.responsibilitychain;

/**
 * @Author : LZB
 * @Description :责任链主要用于处理职责相同，程度不同的类。
 */
public abstract class Programmer {
    protected Programmer next;

    public void setNext(Programmer next) {
        this.next = next;
    }

    abstract void handle(Bug bug);
}
