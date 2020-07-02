package com.design.chain.mine;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 17:08
 * description:  责任链模式 抽象类
 * version:      V1.0
 * ******************************
 */
public interface LoggerInterface {

    // 必须包含对象传递
    void setNextLogger(LoggerInterface nextLogger);

    LoggerInterface getNextLogger();

    // 抽象方法 -> 重写具体日志输出类型
    void write(int level, String message);
}
