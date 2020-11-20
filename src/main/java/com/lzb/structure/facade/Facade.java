package com.lzb.structure.facade;

/**
 * @Author : LZB
 * @Description :
 */
public class Facade {
    public void open() {
        Browser.open();
        WeChat.open();
        IDE.open();
    }

    public void close() {
        Browser.close();
        WeChat.close();
        IDE.close();

    }
}
