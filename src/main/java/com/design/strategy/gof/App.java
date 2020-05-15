package com.design.strategy.gof;

import com.design.utils.CodeUtils;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/5/15 17:48
 * description:  GOF 策略模式案例
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 推荐代码阅读顺序：
     * @see Strategy
     * @see OldCustomerFewStrategy | NewCustomerManyStrategy
     * @see Context
     */
    public static void main(String[] args){
        Context context = new Context(new OldCustomerFewStrategy());
        context.printPrice(998);

        CodeUtils.spilt();

        Context context2 = new Context(new NewCustomerManyStrategy());
        context2.printPrice(1024);
    }
}
