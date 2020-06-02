package com.design.facade;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/3 0:50
 * description:  Ssd
 * version:      V1.0
 * ******************************
 */
public class Ssd implements Computer {
    @Override
    public void open() {
        System.out.println("SSD Open.");
    }
}
