package com.lzb.behavior.observer;

/**
 * @Author : LZB
 * @Description :
 */
public class CriminalObservable extends Observable {
    public void crime(String event) {
        System.out.println("罪犯正在" + event);
        notifyObservers(event);
    }
}
