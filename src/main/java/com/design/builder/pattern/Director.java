package com.design.builder.pattern;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/6 17:20
 * description:  指导者
 * version:      V1.0
 * ******************************
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPartOne();
        builder.buildPartTwo();
        builder.buildPartThr();
    }
}
