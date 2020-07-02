package com.design.builder.pattern;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/6 17:19
 * description:  建造者模式
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 建造者模式
     *     建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象，这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式
     *
     * 主要解决
     *     主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定
     *
     * 何时使用
     *      一些基本部件不会变，而其组合经常变化的时候。
     *
     * 如何解决
     *     将变与不变分离开。
     *
     * 关键代码
     *     建造者：创建和提供实例
     *     建造者接口：依赖接口编程
     *     指导者：管理建造出来的实例的依赖关系
     *     产品：建造者所生产的产品
     * 建造者作为参数进入指导者构造方法，通过特定普遍的构造顺序或算法执行，得到产品
     *
     * 应用实例：
     *     1.去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"
     *     2.StringBuilder
     */
    public static void main(String[] args){
        // 创建建造者接口并指向具体建造者 - 包含最终产品
        Builder concreteBuilder = new ConcreteBuilder();

        // 创建指导者, 把具体建造者即工人作为参数传入, 通过统一方法执行相应的构建命令
        Director director = new Director(concreteBuilder);
        director.construct();

        // 从工人即具体建造者获取产品
        String result = concreteBuilder.getResult();
        System.out.println(result);
    }
}
