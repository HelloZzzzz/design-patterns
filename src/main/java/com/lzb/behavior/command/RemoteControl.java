package com.lzb.behavior.command;

import java.util.Collections;
import java.util.Stack;

/**
 * @Author : LZB
 * @Description :
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    private Stack<Command> undoCommand;


    public RemoteControl() {
        //创建数组用于装Command
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand(); //用到了空对象初始化
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;//没有被明确指定命令的插槽，会被赋予NoCommand对象
            offCommands[i] = noCommand;
        }
        undoCommand = new Stack<>();
    }

    //给指定Slot部署相应的Commands
    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    //按键事件一旦发生就执行execute()
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        if (undoCommand.size() > 0) {
            Command pop = undoCommand.pop();
            pop.undo();
        }

    }
}
