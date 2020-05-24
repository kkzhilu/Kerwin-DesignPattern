package com.design.singleton;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/8 10:52
 * description:  单例模式之枚举方式
 * version:      V1.0
 * ******************************
 */
public enum  EnumSingleton {
    /***
     * APP对象
     */
    APP;

    private App app;

    EnumSingleton() {
        app = new App();
    }

    public App getInstance() {
        System.out.println("**************************");
        System.out.println("APP - 枚举方式");
        return app;
    }
}
