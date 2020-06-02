package com.design.facade;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/3 0:49
 * description:  Ram
 * version:      V1.0
 * ******************************
 */
public class Ram implements Computer {
    @Override
    public void open() {
        System.out.println("Ram Open.");
    }
}
