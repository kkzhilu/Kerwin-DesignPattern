package com.design.factory.bean;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 16:51
 * description:  IntelMotherboard
 * version:      V1.0
 * ******************************
 */
public class IntelMotherboard extends AbstractMotherboard{

    @Override
    public void show() {
        System.out.println("This is Intel Motherboard");
    }

    @Override
    public void prepare() {
        System.out.println("This is Intel Motherboard Prepare");
    }

    @Override
    public void box() {
        System.out.println("This is Intel Motherboard Box");
    }
}
