package com.lzb.behavior.visitor;

/**
 * @Author : LZB
 * @Description :
 */
public class Steak extends Food {
    @Override
    public String name() {
        return "steak";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.chooseFood(this);
    }
}
