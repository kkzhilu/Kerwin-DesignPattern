package com.design.strategy.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/5 10:52
 * description:  飞行接口实现类-不会飞
 * version:      V1.0
 * ******************************
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞哦~~~");
    }
}
