package com.design.factory.bean;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 16:52
 * description:  AMDCpu
 * version:      V1.0
 * ******************************
 */
public class AMDCpu extends AbstractCPU {

    @Override
    public void show() {
        System.out.println("This is AMD Cpu.");
    }

    @Override
    public void prepare() {
        System.out.println("This is AMD Cpu Prepare.");
    }

    @Override
    public void box() {
        System.out.println("This is AMD Cpu Box.");
    }
}
