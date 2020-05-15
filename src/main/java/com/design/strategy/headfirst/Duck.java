package com.design.strategy.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/5 10:55
 * description:  鸭子基类
 * version:      V1.0
 * ******************************
 */
public abstract class Duck {

    /***
     * 通过继承封装一定存在的必要内容，等待子类重写：比如鸭子的描述
     */
    abstract void display();

    /***
     * ❤❤❤ 策略模式的关键 -> 通过组合的方式抽取算法的变化
     */
    FlyBehavior flyBehavior;

    void performFly() {
        flyBehavior.fly();
    }

    /***
     * 通过继承封装不变的内容：假设所有鸭子都会游泳
     */
    void performSwim() {
        System.out.println("i can swim...");
    }



    /********************* 不重要 ********************/
    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
