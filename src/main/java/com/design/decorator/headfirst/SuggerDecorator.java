package com.design.decorator.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/15 11:29
 * description:  糖装饰类
 * version:      V1.0
 * ******************************
 */
public class SuggerDecorator implements Component {

    Component coffe;

    SuggerDecorator(Component coffe) {
        this.coffe = coffe;
    }

    @Override
    public String getName() {
        return coffe.getName() + ", 糖";
    }

    @Override
    public double getSpend() {
        return coffe.getSpend() + 0.5D;
    }
}
