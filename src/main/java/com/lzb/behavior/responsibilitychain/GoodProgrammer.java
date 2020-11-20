package com.lzb.behavior.responsibilitychain;

/**
 * @Author : LZB
 * @Description :
 */
public class GoodProgrammer extends Programmer {
    @Override
    void handle(Bug bug) {
        if (50 < bug.getValue()) {
            solve(bug);
        } else if (null != next) {
            next.handle(bug);
        }
    }


    private void solve(Bug bug) {
        System.out.println("优秀程序员解决了一个难度为 " + bug.getValue() + " 的 bug");
    }
}
