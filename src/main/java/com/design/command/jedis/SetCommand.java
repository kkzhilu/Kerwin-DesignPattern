package com.design.command.jedis;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/5/25 15:29
 * description:  Set Command | Set 命令
 * version:      V1.0
 * ******************************
 */
public class SetCommand implements Command {

    private SetReceiver receiver;

    private String arg;

    @Override
    public void execute() {
        receiver.doCommand(this.arg);
    }

    public SetCommand(SetReceiver receiver, String arg) {
        this.receiver = receiver;
        this.arg = arg;
    }

    public SetReceiver getReceiver() {
        return receiver;
    }

    public void setReceiver(SetReceiver receiver) {
        this.receiver = receiver;
    }

    public String getArg() {
        return arg;
    }

    public void setArg(String arg) {
        this.arg = arg;
    }
}
