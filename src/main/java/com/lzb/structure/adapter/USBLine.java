package com.lzb.structure.adapter;

/**
 * @Author : LZB
 * @Description :
 */
public class USBLine {
    public void charge(int volt) {
        if (5 != volt) {
            throw new IllegalArgumentException("只支持5V电压");
        }
        System.out.println("充电成功");
    }
}
