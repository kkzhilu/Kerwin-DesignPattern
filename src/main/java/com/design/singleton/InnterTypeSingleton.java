package com.design.singleton;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/8 10:29
 * description:  单例模式之静态内部类
 * version:      V1.0
 * ******************************
 */
public class InnterTypeSingleton {

    private InnterTypeSingleton(){
        throw new IllegalStateException();
    }

    // 静态内部类方式
    // 类似饿汉保证天然的线程安全
    private static class SingletonHolder{
        private final static App app = new App();
    }

    static App getInstance(){
        System.out.println("**************************");
        System.out.println("APP - 静态内部类方式(Holder)");
        return SingletonHolder.app;
    }
}
