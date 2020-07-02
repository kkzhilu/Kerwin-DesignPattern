package com.design.chain.pattern;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 17:18
 * description:  Debug 级别日志
 * version:      V1.0
 * ******************************
 */
public class DebugLoger extends AbstractLogger {

    public DebugLoger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("DebugLoger Console::Logger: " + message);
    }
}
