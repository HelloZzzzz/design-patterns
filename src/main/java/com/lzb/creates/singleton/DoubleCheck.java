package com.lzb.creates.singleton;

import java.io.ObjectStreamException;

/**
 * @Author : LZB
 * @Description :
 */
public class DoubleCheck {
    private static volatile DoubleCheck doubleCheck;

    private DoubleCheck() {
        if (null != doubleCheck) {
            throw new RuntimeException();
        }
    }

    private Object readResolve() throws ObjectStreamException {
        return doubleCheck;
    }

    public static DoubleCheck getDoubleCheck() {
        if (null == doubleCheck) {
            synchronized (DoubleCheck.class) {
                if (null == doubleCheck) {
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }

}
