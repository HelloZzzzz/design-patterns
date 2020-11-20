package com.lzb.behavior.state;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * @Author : LZB
 * @Description :
 */

public class MyUserTest {

    @Test
    public void test() {
        // 用户初始状态为普通用户
        MyUser user = new MyUser();
        // 输出：模拟面试是 Plus 会员专享功能
        user.mockInterview();

        // 用户购买 Plus 会员，状态改变
        user.purchasePlus();
        // 输出：开始模拟面试
        user.mockInterview();

        // Plus 会员过期，变成普通用户，状态改变
        user.expire();
        // 输出：模拟面试是 Plus 会员专享功能
        user.mockInterview();

    }
}
