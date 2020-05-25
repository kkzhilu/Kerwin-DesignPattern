package com.design.command.jedis;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/5/25 15:28
 * description:  Command 命令上层接口
 * version:      V1.0
 * ******************************
 */
public interface Command {

    /***
     * 执行命令
     */
    void execute();
}
