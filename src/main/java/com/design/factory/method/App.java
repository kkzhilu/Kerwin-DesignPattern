package com.design.factory.method;

import com.design.utils.CodeUtils;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 17:02
 * description:  App 工厂方法模式
 * version:      V1.0
 * ******************************
 */
public class App {

    /****
     * 工厂方法模式 (Factory Method Pattern)通过让子类决定该创建的对象是什么
     * 来达到将对象创建的国程封装的目的。
     *
     * 推荐代码阅读顺序：
     *
     * @see Factory
     * @see IntelCpuFactory | AMDCpuFactory
     */
    public static void main(String[] args){
        Factory intelCpuFactory = new IntelCpuFactory();
        intelCpuFactory.orderCpu();

        CodeUtils.spilt();

        Factory amdCpuFactory = new AMDCpuFactory();
        amdCpuFactory.orderCpu();

    }
}
