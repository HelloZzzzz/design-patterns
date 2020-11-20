package com.lzb.structure.decorator;

/**
 * @Author : LZB
 * @Description :
 */
public class NecklaceDecorator implements Beauty {
    private Beauty me;

    public NecklaceDecorator(Beauty me) {
        this.me = me;
    }

    @Override
    public int getBeautyValue() {
        return me.getBeautyValue() + 123;
    }
}
