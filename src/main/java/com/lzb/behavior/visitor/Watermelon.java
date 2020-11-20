package com.lzb.behavior.visitor;

/**
 * @Author : LZB
 * @Description :
 */
public class Watermelon extends Food {
    @Override
    public String name() {
        return "watermelon";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.chooseFood(this);
    }
}
