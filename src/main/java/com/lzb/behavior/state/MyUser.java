package com.lzb.behavior.state;

/**
 * @Author : LZB
 * @Description :
 */
public class MyUser implements User, SwitchState {
    User state = new Normal();

    @Override
    public void mockInterview() {
        state.mockInterview();
    }

    @Override
    public void purchasePlus() {
        state = new Plus();
    }

    @Override
    public void expire() {
        state = new Normal();
    }
}
