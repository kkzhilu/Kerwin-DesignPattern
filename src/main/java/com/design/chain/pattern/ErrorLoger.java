package com.design.chain.pattern;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 17:18
 * description:  Error 级别日志
 * version:      V1.0
 * ******************************
 */
public class ErrorLoger extends AbstractLogger {

    public ErrorLoger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLoger Console::Logger: " + message);
    }
}
