package com.design.command.jedis;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/5/25 15:31
 * description:  SetReceiver Set命令接收者
 * version:      V1.0
 * ******************************
 */
public class SetReceiver {
    OutputStream write;

    InputStream read;

    public void doCommand (String arg) {
        String[] strings = arg.split(" ");
        String key = strings[0];
        String val = strings[1];

        byte[] bytes = new byte[0];
        try {
            String sb = "*3" + SPILET +
                    "$3" + SPILET +
                    "SET" + SPILET +
                    "$" + key.getBytes().length + SPILET +
                    key + SPILET +
                    "$" + val.getBytes().length + SPILET +
                    val + SPILET;
            write.write(sb.getBytes());
            bytes = new byte[1024];
            read.read(bytes);
            System.out.println("Result: " + new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SetReceiver(OutputStream write, InputStream read) {
        this.write = write;
        this.read = read;
    }

    private final String SPILET = "\r\n";
}
