package com.design.proxy.jdk;

import java.text.MessageFormat;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 15:46
 * description:  Cat
 * version:      V1.0
 * ******************************
 */
public class Cat implements IAnimale {

    @Override
    public void eat(String food) {
        System.out.println(MessageFormat.format("eat food: {0}", food));
    }
}
