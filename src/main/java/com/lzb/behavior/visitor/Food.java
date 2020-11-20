package com.lzb.behavior.visitor;

/**
 * @Author : LZB
 * @Description :
 */
public abstract class Food {
    public abstract String name();

    // Food 中添加 accept 方法，接收访问者
    public abstract void accept(Visitor visitor);
}
