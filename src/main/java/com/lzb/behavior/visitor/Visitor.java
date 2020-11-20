package com.lzb.behavior.visitor;

/**
 * @Author : LZB
 * @Description :
 */
public interface Visitor {
    void chooseFood(Lobster lobster);

    void chooseFood(Watermelon watermelon);

    void chooseFood(Steak steak);

    void chooseFood(Banana banana);
}
