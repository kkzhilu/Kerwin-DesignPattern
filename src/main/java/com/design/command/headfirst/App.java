package com.design.command.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/1 1:11
 * description:  App 测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /****
     * 命令模式
     *
     * 推荐阅读顺序：
     * @see Command
     * @see LightOnCommand | LightOffCommand
     * @see Light
     * @see SimpleRemoteControl
     *
     */
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();

        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        LightOffCommand lightOff = new LightOffCommand(light);
        remote.setCommand(lightOff);
        remote.buttonWasPressed();
    }
}


