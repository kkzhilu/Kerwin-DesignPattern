package com.design.command.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/1 1:09
 * description:  LightOnCommand
 * version:      V1.0
 * ******************************
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
