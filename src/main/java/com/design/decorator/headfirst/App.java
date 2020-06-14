package com.design.decorator.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/15 11:25
 * description:  HeadFirst - 摩卡咖啡装饰模式测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /****
     * 推荐阅读顺序：
     *
     * @see Component
     * @see ConcreteComponent
     * @see MilkDecorator | SuggerDecorator 重点在同样的父级接口
     */
    public static void main(String[] args){
        Component coffe = new ConcreteComponent("摩卡咖啡");
        System.out.println("name : -> " + coffe.getName());
        System.out.println("spand: -> " + coffe.getSpend());

        coffe = new MilkDecorator(coffe);
        coffe = new SuggerDecorator(coffe);
        System.out.println("name : -> " + coffe.getName());
        System.out.println("spand: -> " + coffe.getSpend());
    }
}
