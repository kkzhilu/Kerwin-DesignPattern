package com.design.factory.method;

import com.design.factory.bean.AMDCpu;
import com.design.factory.bean.AbstractCPU;


/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 17:18
 * description:  AMDCpuFactory
 * version:      V1.0
 * ******************************
 */
public class AMDCpuFactory extends Factory {

    @Override
    public AbstractCPU generateCpu() {
        return new AMDCpu();
    }
}
