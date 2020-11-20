package com.lzb.behavior.state;

/**
 * @Author : LZB
 * @Description :
 */
public class Normal implements User {
    @Override
    public void mockInterview() {
        System.out.println("模拟面试是 Plus 会员专享功能");
    }
}
