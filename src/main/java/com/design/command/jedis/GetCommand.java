package com.design.command.jedis;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/5/25 15:29
 * description:  Get Command | Get 命令
 * version:      V1.0
 * ******************************
 */
public class GetCommand implements Command {

    private GetReceiver receiver;

    private String arg;

    @Override
    public void execute() {
        receiver.doCommand(this.arg);
    }

    public GetCommand(GetReceiver receiver, String arg) {
        this.receiver = receiver;
        this.arg = arg;
    }

    public GetReceiver getReceiver() {
        return receiver;
    }

    public void setReceiver(GetReceiver receiver) {
        this.receiver = receiver;
    }

    public String getArg() {
        return arg;
    }

    public void setArg(String arg) {
        this.arg = arg;
    }
}
