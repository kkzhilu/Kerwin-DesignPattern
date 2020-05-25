package com.design.command.jedis;

import java.util.Stack;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/5/25 15:51
 * description:  Invoker 执行者
 * version:      V1.0
 * ******************************
 */
public class Invoker {

    private Stack<Command> commands;

    public Invoker() {
        commands = new Stack<>();
    }

    public void addCommand(Command command) {
        commands.push(command);
    }

    public void undoCommand() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void execute() {
        if (!commands.empty()) {
            Command command = commands.pop();
            command.execute();
        }
    }
}
