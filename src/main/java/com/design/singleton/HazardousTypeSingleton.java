package com.design.singleton;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/8 9:51
 * description:  单例模式之饿汉型模式
 * version:      V1.0
 * ******************************
 */
public class HazardousTypeSingleton {

    private static final App APP = new App();

    // 私有构造方法
    private HazardousTypeSingleton () {}

    // 类加载时已初始化，不会有多线程的问题
    static App getInstance() {
        System.out.println("**************************");
        System.out.println("APP - 饿汉型模式");
        return APP;
    }
}
