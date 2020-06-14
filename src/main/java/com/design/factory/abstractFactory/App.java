package com.design.factory.abstractFactory;

import com.design.utils.CodeUtils;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 17:11
 * description:  App 抽象工厂模式
 * version:      V1.0
 * ******************************
 */
public class App {

    /****
     * 抽象工厂模式 -> 产品族维度
     *
     * 推荐阅读顺序：
     *
     * @see AbstractFactory
     * @see 抽象方法模式.png
     * @see IntelFactory | AbstractFactory
     *
     */
    public static void main(String[] args){
        AbstractFactory intel = new IntelFactory();
        intel.createCpu().show();
        intel.createMainboard().show();

        CodeUtils.spilt();

        AbstractFactory amd = new AMDFactory();
        amd.createCpu().show();
        amd.createMainboard().show();
    }
}
