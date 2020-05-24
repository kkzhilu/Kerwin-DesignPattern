package com.design.factory.simplefactory;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 16:57
 * description:  App 简单工厂模式
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 简单工厂模式不属于23种设计模式, 它仅仅是把对象的调用和生产进行了初步解耦
     *
     * 简单来说就是把创建对象的细节屏蔽到工厂之中, 仅此而已
     *
     * @see SimpleFactory
     */
    public static void main(String[] args){
        SimpleFactory.createCpu("INTEL").show();
        SimpleFactory.createCpu("AMD").show();
    }
}
