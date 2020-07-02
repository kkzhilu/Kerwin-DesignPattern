package com.design.chain.mine;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 17:11
 * description:  INFO 级别log
 * version:      V1.0
 * ******************************
 */
public class InfoLoger implements LoggerInterface {

    @Override
    public void write(int level, String message) {
        if (level == LogerEnums.INFO.getValue()) {
            System.out.println("InfoLoger Console::Logger: " + message);
        } else {
            this.setNextLogger(new DebugLoger());
            this.getNextLogger().write(level, message);
        }
    }

    private LoggerInterface loggerInterface;

    @Override
    public void setNextLogger(LoggerInterface nextLogger) {
        loggerInterface = nextLogger;
    }

    @Override
    public LoggerInterface getNextLogger() {
        return loggerInterface;
    }
}
