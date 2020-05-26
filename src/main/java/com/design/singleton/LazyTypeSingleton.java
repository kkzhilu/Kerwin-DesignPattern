package com.design.singleton;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/8 9:57
 * description:  单例模式之懒汉型模式
 * version:      V1.0
 * ******************************
 */
public class LazyTypeSingleton {

    private LazyTypeSingleton () {}

    // 静态私用成员，没有初始化
    private static App intance = null;

    /***
     * 直接加synchronized关键字
     */
    synchronized  static App getIntance () {
        System.out.println("**************************");
        System.out.println("APP - 懒汉型模式");
        if (null == intance) {
            intance = new App();
            return intance;
        }
        return intance;
    }

    //**************************************************************************

    // volatile关键字修饰，防止指令重排
    private volatile static App app = null;

    /***
     * Double Check Lock（DCL） 双重锁校验
     */
    static App getInstanceByDCL () {
        System.out.println("**************************");
        System.out.println("APP - 饿汉模式DCL 双重锁校验");
        if (null == app) {
            synchronized (LazyTypeSingleton.class) {
                if (null == app) {
                    app = new App();
                    return app;
                }
            }
        }
        return app;
    }
}
