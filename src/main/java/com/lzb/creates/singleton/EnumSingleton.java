package com.lzb.creates.singleton;

/**
 * @Author : LZB
 * @Description :
 * <p>
 * <p>
 * 1、防反射
 * if ((clazz.getModifiers() & Modifier.ENUM) != 0)
 * throw new IllegalArgumentException("Cannot reflectively create enum objects");
 * <p>
 * 2、在读入 Singleton 对象时，每个枚举类型和枚举名字都是唯一的，所以在序列化时，仅仅
 * 只是对枚举的类型和变量名输出到文件中，在读入文件反序列化成对象时，使用 Enum 类的
 * valueOf(String name) 方法根据变量的名字查找对应的枚举对象。所以，在序列化和反序列
 * 化的过程中，只是写出和读入了枚举类型和名字，没有任何关于对象的操作。
 */
public enum EnumSingleton {
    INSTANCE;
}
