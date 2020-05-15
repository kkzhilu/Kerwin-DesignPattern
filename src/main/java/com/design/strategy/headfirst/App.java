package com.design.strategy.headfirst;

import com.design.utils.CodeUtils;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/5 10:36
 * description:  策略模式Main方法
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 推荐代码阅读顺序：
     * @see Duck
     * @see FlyBehavior
     * @see RubberDuck
     */
    public static void main(String[] args){
        Duck duck = new WoodDuck();
        duck.display();
        duck.performFly();
        duck.performSwim();

        CodeUtils.spilt();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performSwim();
    }
}
