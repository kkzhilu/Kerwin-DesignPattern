package com.design.strategy.gof;

/**
 * ******************************
 * author：      柯贤铭
 * createTime:   2020/5/15 17:52
 * description:  负责和具体的策略类交互
 *               使策略模式，使具体的算法和直接的客户调用分离，使算法可以独立于客户端进行独立变化
 * version:      V1.0
 * ******************************
 */
public class Context {

    /***
     * ❤❤❤ 策略模式的关键 -> 通过组合的方式抽取算法的变化
     */
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double originalCost) {
        System.out.printf("您该报价：%6.2f", strategy.getPrice(originalCost));
    }
}
