package com.design.command.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/1 1:09
 * description:  LightOffCommand
 * version:      V1.0
 * ******************************
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}