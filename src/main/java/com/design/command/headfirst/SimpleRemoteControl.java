package com.design.command.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/1 1:11
 * description:  远程执行者 Invoker
 * version:      V1.0
 * ******************************
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
