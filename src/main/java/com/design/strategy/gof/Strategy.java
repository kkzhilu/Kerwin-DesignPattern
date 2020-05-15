package com.design.strategy.gof;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/5/15 17:48
 * description:  Strategy
 * version:      V1.0
 * ******************************
 */
public interface Strategy {

    /** 获取价格 **/
    double getPrice(double originalCost);
}
