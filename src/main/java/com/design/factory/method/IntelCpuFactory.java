package com.design.factory.method;

import com.design.factory.bean.AbstractCPU;
import com.design.factory.bean.IntelCpu;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 17:18
 * description:  IntelCpuFactory
 * version:      V1.0
 * ******************************
 */
public class IntelCpuFactory extends Factory {

    @Override
    public AbstractCPU generateCpu() {
        return new IntelCpu();
    }
}
