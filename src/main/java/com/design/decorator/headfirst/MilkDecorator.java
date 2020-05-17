package com.design.decorator.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/15 11:29
 * description:  牛奶装饰类
 * version:      V1.0
 * ******************************
 */
public class MilkDecorator implements Component {

    Component coffe;

    MilkDecorator(Component coffe) {
        this.coffe = coffe;
    }

    @Override
    public String getName() {
       return coffe.getName() + ", 牛奶";
    }

    @Override
    public double getSpend() {
        return coffe.getSpend() + 2D;
    }
}
