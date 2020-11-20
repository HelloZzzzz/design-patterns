package com.lzb.behavior.command;


import org.junit.Test;

/**
 * @Author : LZB
 * @Description :
 */

public class RemoteControlTest {
    @Test
    public void client() {
        //创建遥控器对象
        RemoteControl remoteControl = new RemoteControl();
        //创建家用电器对象
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        //创建一些命令灯的Command
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        //让0号插槽去控制客厅灯的开关
        remoteControl.setCommands(0, livingRoomLightOn, livingRoomLightOff);
        //让1号插槽去控制厨房灯的开关
        remoteControl.setCommands(1, kitchenLightOn, kitchenLightOff);


        remoteControl.undoButtonWasPushed();


        //房屋主人按下按钮去控制灯的开关
        //按下0号插槽的开按钮
        remoteControl.onButtonWasPushed(0);
        //按下0号插槽的关按钮
        remoteControl.offButtonWasPushed(0);
        //按下1号插槽的关按钮
        remoteControl.offButtonWasPushed(1);
        //按下2号插槽的开按钮
        remoteControl.onButtonWasPushed(2);


        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();

    }

}
