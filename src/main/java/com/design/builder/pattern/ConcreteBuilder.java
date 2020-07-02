package com.design.builder.pattern;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/6 17:22
 * description:  具体建造者
 * version:      V1.0
 * ******************************
 */
public class ConcreteBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildPartOne() {
        buffer.append("i am part one\n");
    }

    @Override
    public void buildPartTwo() {
        buffer.append("i am part two\n");
    }

    @Override
    public void buildPartThr() {
        buffer.append("i am part Thr\n");
    }

    @Override
    public String getResult() {
        return buffer.toString();
    }
}
