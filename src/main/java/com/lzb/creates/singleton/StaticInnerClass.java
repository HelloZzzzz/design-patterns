package com.lzb.creates.singleton;

import java.io.ObjectStreamException;

/**
 * @Author : LZB
 * @Description :
 * <p>
 * 1、Java类的加载过程包括：加载、连接（验证准备解析）、初始化。初始化阶段执行类的clinit方法
 * （clinit = class + initialize），为类的静态变量赋予初始值和执行静态代码块的内容，但不会立
 * 刻加载内部类，内部类在使用的时候加载。当调用getStaticInnerClass（）时，使用了STATIC_INNER_CLASS
 * 此时才会去初始化SingletonHolder，在SingletonHolder中new 出 Singleton 对象。这就实现了懒加载。
 * <p>
 * 2、虚拟机在加载类的clinic方法时，会保证clinic在多线程中被正确的加锁、同步。即时有多个线程
 * 同事去去初始化一个类，一次也只有一个线程可以执行clinic方法，其他线程都需要阻塞等待，从而
 * 保证了线程安全。
 */
public class StaticInnerClass {

    private StaticInnerClass() {
        if (null != SingletonHolder.STATIC_INNER_CLASS)
            throw new RuntimeException();
    }

    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.STATIC_INNER_CLASS;
    }

    private static class SingletonHolder {
        private static final StaticInnerClass STATIC_INNER_CLASS = new StaticInnerClass();
    }


    public static StaticInnerClass getStaticInnerClass() {
        return SingletonHolder.STATIC_INNER_CLASS;
    }

}
