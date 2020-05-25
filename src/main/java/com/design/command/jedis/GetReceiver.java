package com.design.command.jedis;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/5/25 15:31
 * description:  GetReceiver Get命令接收者
 * version:      V1.0
 * ******************************
 */
public class GetReceiver {

    OutputStream write;

    InputStream read;

    public void doCommand (String arg) {
        String[] strings = arg.split(" ");
        String key = strings[0];

        byte[] bytes = new byte[0];
        try {
            StringBuffer sb = new StringBuffer();
            sb.append("*2").append("\r\n");
            sb.append("$3").append("\r\n");
            sb.append("GET").append("\r\n");
            sb.append("$").append(key.getBytes().length).append("\r\n");
            sb.append(key).append("\r\n");
            write.write(sb.toString().getBytes());
            bytes = new byte[1024];
            read.read(bytes);
            System.out.println("Result: " + new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public GetReceiver(OutputStream write, InputStream read) {
        this.write = write;
        this.read = read;
    }
}
