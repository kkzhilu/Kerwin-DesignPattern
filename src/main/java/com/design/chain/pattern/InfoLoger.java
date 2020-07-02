package com.design.chain.pattern;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 17:11
 * description:  INFO 级别log
 * version:      V1.0
 * ******************************
 */
public class InfoLoger extends AbstractLogger {

    public InfoLoger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("InfoLoger Console::Logger: " + message);
    }
}
