package com.design.factory.method;


import com.design.factory.bean.AbstractCPU;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 17:00
 * description:  Factory CPU工厂
 * version:      V1.0
 * ******************************
 */
public abstract class Factory {

    /***
     * 产品订购方案
     */
    public AbstractCPU orderCpu () {
        AbstractCPU cpu = generateCpu();
        cpu.show();
        cpu.prepare();
        cpu.box();

        // 假设有相同的业务处理逻辑...
        return cpu;
    }

    protected abstract AbstractCPU generateCpu();
}
