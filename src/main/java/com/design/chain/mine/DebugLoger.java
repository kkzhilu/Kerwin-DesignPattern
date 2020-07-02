package com.design.chain.mine;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 17:18
 * description:  Debug 级别日志
 * version:      V1.0
 * ******************************
 */
public class DebugLoger implements LoggerInterface {

    @Override
    public void write(int level, String message) {
        if (level == LogerEnums.DEBUG.getValue()) {
            System.out.println("DebugLoger Console::Logger: " + message);
        } else {
            this.setNextLogger(new ErrorLoger());
            this.getNextLogger().write(level, message);
        }
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
