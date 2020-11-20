package com.lzb.behavior.command;

/**
 * @Author : LZB
 * @Description :命令模式——将请求封装成“对象”，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持撤销操作。
 */
public interface Command {
    void execute();

    void undo();
}
