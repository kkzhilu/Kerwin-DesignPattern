package com.design.strategy.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/5 11:03
 * description:  橡皮鸭设置不会飞的行为
 * version:      V1.0
 * ******************************
 */
public class RubberDuck extends Duck {

    RubberDuck(){
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("我是一只橡皮鸭");
    }
}
