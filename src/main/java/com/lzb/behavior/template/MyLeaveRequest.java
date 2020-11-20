package com.lzb.behavior.template;

/**
 * @Author : LZB
 * @Description :在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。
 */
public class MyLeaveRequest extends LeaveRequest {
    @Override
    String name() {
        return "嘟嘟";
    }

    @Override
    String reason() {
        return "S11总决赛";
    }

    @Override
    String duration() {
        return "一";
    }
}
