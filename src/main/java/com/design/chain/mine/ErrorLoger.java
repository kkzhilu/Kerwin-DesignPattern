package com.design.chain.mine;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 17:18
 * description:  Error 级别日志
 * version:      V1.0
 * ******************************
 */
public class ErrorLoger implements LoggerInterface {

    @Override
    public void write(int level, String message) {
        System.out.println("ErrorLoger Console::Logger: " + message);
    }

    private LoggerInterface loggerInterface;

    @Override
    public void setNextLogger(LoggerInterface nextLogger) {
        this.loggerInterface = nextLogger;
    }

    @Override
    public LoggerInterface getNextLogger() {
        return loggerInterface;
    }
}
