package com.lzb.behavior.command;

/**
 * @Author : LZB
 * @Description :
 */
public class Light {
    String type;

    public Light(String type) {
        this.type = type;
    }

    public void lightOn() {
        System.out.println("打开了" + type + "电灯");
    }

    public void lightOff() {
        System.out.println("关闭了" + type + "电灯");
    }
}
