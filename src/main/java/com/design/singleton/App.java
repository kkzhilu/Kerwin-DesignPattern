package com.design.singleton;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/8 9:50
 * description:  单例模式测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。
     * 属于创建型模式，它提供了一种创建对象的最佳方式
     * 这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象
     *
     * 推荐阅读顺序：
     *
     * @see HazardousTypeSingleton 饿汉型
     * @see LazyTypeSingleton      懒汉型
     * @see LazyTypeSingleton#getInstanceByDCL() 懒汉型 基于双重锁校验  ->  推荐 - 保证线程安全,延时加载
     * @see InnterTypeSingleton    静态内部类方式 ->  推荐 - 线程安全，调用效率高，可以延时加载
     * @see EnumSingleton          枚举方式      ->   推荐 - 线程安全，调用效率高，不能延时加载，可以天然的防止反射和反序列化调用
     */
    public static void main(String[] args){
        // 饿汉型
        App app = HazardousTypeSingleton.getInstance();

        // 懒汉型
        App lazyApp = LazyTypeSingleton.getIntance();

        // 懒汉型 - DCL
        App lazyAppDCL = LazyTypeSingleton.getInstanceByDCL();

        // 静态内部类方式
        App innterApp = InnterTypeSingleton.getInstance();

        // 枚举方式
        App enumApp = EnumSingleton.APP.getInstance();
    }
}
