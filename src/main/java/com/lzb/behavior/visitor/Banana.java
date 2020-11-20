package com.lzb.behavior.visitor;

/**
 * @Author : LZB
 * @Description :
 */
public class Banana extends Food {
    @Override
    public String name() {
        return "banana";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.chooseFood(this);
    }
}