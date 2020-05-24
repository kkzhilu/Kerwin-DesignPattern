package com.design.factory.bean;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 16:51
 * description:  AMDMotherboard
 * version:      V1.0
 * ******************************
 */
public class AMDMotherboard extends AbstractMotherboard{

    @Override
    public void show() {
        System.out.println("This is AMD Motherboard");
    }

    @Override
    public void prepare() {
        System.out.println("This is AMD Motherboard Prepare");
    }

    @Override
    public void box() {
        System.out.println("This is AMD Motherboard Box");
    }
}
