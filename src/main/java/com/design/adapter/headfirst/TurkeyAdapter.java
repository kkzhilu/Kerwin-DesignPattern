package com.design.adapter.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/1 15:13
 * description:  火鸡适配器
 * version:      V1.0
 * ******************************
 */
public class TurkeyAdapter implements Duck{

    Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
}
