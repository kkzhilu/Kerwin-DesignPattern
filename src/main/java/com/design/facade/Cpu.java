package com.design.facade;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/3 0:48
 * description:  Cpu
 * version:      V1.0
 * ******************************
 */
public class Cpu implements Computer{
    @Override
    public void open() {
        System.out.println("Cpu Open.");
    }
}
