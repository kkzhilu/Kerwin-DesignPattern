package com.design.factory.abstractFactory;

import com.design.factory.bean.AMDCpu;
import com.design.factory.bean.AMDMotherboard;
import com.design.factory.bean.AbstractCPU;
import com.design.factory.bean.AbstractMotherboard;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 17:10
 * description:  IntelFactory
 * version:      V1.0
 * ******************************
 */
public class AMDFactory extends AbstractFactory{
    @Override
    public AbstractCPU createCpu() {
        return new AMDCpu();
    }

    @Override
    public AbstractMotherboard createMainboard() {
        return new AMDMotherboard();
    }
}
