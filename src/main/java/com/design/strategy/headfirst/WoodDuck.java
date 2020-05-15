package com.design.strategy.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/5 11:03
 * description:  丑小鸭设置用翅膀飞行的行为
 * version:      V1.0
 * ******************************
 */
public class WoodDuck extends Duck {

    WoodDuck(){
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("我是一只丑小鸭");
    }
}
