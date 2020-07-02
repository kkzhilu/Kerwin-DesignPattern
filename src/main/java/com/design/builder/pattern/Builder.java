package com.design.builder.pattern;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/6 17:19
 * description:  建造者接口
 * version:      V1.0
 * ******************************
 */
public interface Builder {

    void buildPartOne();

    void buildPartTwo();

    void buildPartThr();

    /***
     * 一般情况肯定是一个复杂的对象
     */
    String getResult();
}
