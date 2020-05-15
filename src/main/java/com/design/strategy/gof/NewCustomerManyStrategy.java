package com.design.strategy.gof;

/**
 * ******************************
 * author：      柯贤铭
 * createTime:   2020/5/15 17:50
 * description:  新客户大批量
 * version:      V1.0
 * ******************************
 */
public class NewCustomerManyStrategy implements  Strategy{

    public double getPrice(double originalCost) {
        System.out.println("打九折！");
        return originalCost * 0.9;
    }
}
