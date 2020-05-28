package com.design.command.jedis;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/5/25 15:57
 * description:  App测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    public static void main(String[] args) throws IOException {
        // 初始化Socket流
        Socket socket = new Socket("127.0.0.1", 6379);
        OutputStream write = socket.getOutputStream();
        InputStream read = socket.getInputStream();

        Invoker invoker = new Invoker();

        // 初始化Get | Set任务执行者
        GetReceiver getReceiver = new GetReceiver(write, read);
        SetReceiver setReceiver = new SetReceiver(write, read);

        // 测试get命令
        invoker.addCommand(new GetCommand(getReceiver, "key"));

        // 测试set命令
        invoker.addCommand(new SetCommand(setReceiver, "key xixixi"));

        // 测试get命令
        invoker.addCommand(new GetCommand(getReceiver, "key"));

        // 测试get命令
        invoker.addCommand(new GetCommand(getReceiver, "key"));

        // 测试撤销上一个命令 -> 输出四次则测试失败，三次则成功
        invoker.undoCommand();
        invoker.execute();
    }
}
