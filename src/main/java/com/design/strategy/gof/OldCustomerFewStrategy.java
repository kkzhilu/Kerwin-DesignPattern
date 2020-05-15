package com.design.strategy.gof;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/5/15 17:50
 * description:  老客户小批量
 * version:      V1.0
 * ******************************
 */
public class OldCustomerFewStrategy implements Strategy {

    public double getPrice(double originalCost) {
        System.out.println("打八五折！");
        return originalCost * 0.85;
    }
}
