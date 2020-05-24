package com.design.factory.bean;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 16:52
 * description:  IntelCpu
 * version:      V1.0
 * ******************************
 */
public class IntelCpu extends AbstractCPU {

    @Override
    public void show() {
        System.out.println("This is Intel Cpu.");
    }

    @Override
    public void prepare() {
        System.out.println("This is Intel Cpu Prepare.");
    }

    @Override
    public void box() {
        System.out.println("This is Intel Cpu Box.");
    }
}
