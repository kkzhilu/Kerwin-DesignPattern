package com.design.factory.abstractFactory;


import com.design.factory.bean.AbstractCPU;
import com.design.factory.bean.AbstractMotherboard;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/12/23 17:12
 * description:  AbstractFactory
 * version:      V1.0
 * ******************************
 */
public abstract class AbstractFactory {

    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public abstract AbstractCPU createCpu();

    /**
     * 创建主板对象
     * @return 主板对象
     */
    public abstract AbstractMotherboard createMainboard();
}
