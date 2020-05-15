package com.design.strategy.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/5 10:51
 * description:  飞行接口实现类-用翅膀飞行
 * version:      V1.0
 * ******************************
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("用翅膀飞行~~~");
    }
}
