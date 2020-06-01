package com.design.adapter.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/1 15:12
 * description:  野火鸡
 * version:      V1.0
 * ******************************
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("咯咯");
    }

    @Override
    public void fly() {
        System.out.println("我在飞，虽然我飞的很近");
    }
}
