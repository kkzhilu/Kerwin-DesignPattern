package com.design.factory.abstractFactory;

import com.design.factory.bean.AbstractCPU;
import com.design.factory.bean.AbstractMotherboard;
import com.design.factory.bean.IntelCpu;
import com.design.factory.bean.IntelMotherboard;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 17:10
 * description:  IntelFactory
 * version:      V1.0
 * ******************************
 */
public class IntelFactory extends  AbstractFactory{


    @Override
    public AbstractCPU createCpu() {
        return new IntelCpu();
    }

    @Override
    public AbstractMotherboard createMainboard() {
        return new IntelMotherboard();
    }
}
