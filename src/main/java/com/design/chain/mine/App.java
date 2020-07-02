package com.design.chain.mine;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 17:19
 * description:  责任链模式测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    public static void main(String[] args){
        LoggerInterface log = new InfoLoger();
        log.write(LogerEnums.DEBUG.getValue(), "test the debug message");
    }
}
