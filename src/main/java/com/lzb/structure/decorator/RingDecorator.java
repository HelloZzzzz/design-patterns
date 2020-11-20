package com.lzb.structure.decorator;

/**
 * @Author : LZB
 * @Description :
 */
public class RingDecorator implements Beauty {
    private Beauty me;

    public RingDecorator(Beauty me) {
        this.me = me;
    }


    //静态代理既视感
    @Override
    public int getBeautyValue() {
        return 2 * me.getBeautyValue();
    }
}
