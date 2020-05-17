package com.design.decorator.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/15 11:27
 * description:  具体构件 - 被装饰的类
 * version:      V1.0
 * ******************************
 */
public class ConcreteComponent implements Component {

    private String name;

    public ConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSpend() {
        return 10;
    }
}
