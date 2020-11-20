package com.lzb.behavior.responsibilitychain;

/**
 * @Author : LZB
 * @Description :
 */
public class NormalProgrammer extends Programmer {
    @Override
    void handle(Bug bug) {
        if (20 < bug.getValue() && bug.getValue() <= 50) {
            solve(bug);
        } else if (null != next) {
            next.handle(bug);
        }
    }


    private void solve(Bug bug) {
        System.out.println("普通程序员解决了一个难度为 " + bug.getValue() + " 的 bug");
    }
}
