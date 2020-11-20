package com.lzb.behavior.responsibilitychain;

/**
 * @Author : LZB
 * @Description :
 */
public class NewbieProgrammer extends Programmer {
    @Override
    void handle(Bug bug) {
        if (20 >= bug.getValue()) {
            solve(bug);
        } else if (null != next) {
            next.handle(bug);
        }
    }


    private void solve(Bug bug) {
        System.out.println("菜鸟程序员解决了一个难度为 " + bug.getValue() + " 的 bug");
    }


}
