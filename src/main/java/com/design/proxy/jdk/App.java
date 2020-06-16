package com.design.proxy.jdk;

import com.design.utils.CodeUtils;

import java.lang.reflect.Proxy;

/**
 * ******************************
 * author：      柯贤铭
 * createTime:   2020/6/16 15:50
 * description:  JDK代理 测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    public static void main(String[] args) {

        // 代理子类实现
        IAnimale cat = (IAnimale) Proxy.newProxyInstance(Cat.class.getClassLoader(),
                new Class[]{IAnimale.class}, new AnimalInvocationHandler(new Cat()));
        cat.eat("猫粮");

        CodeUtils.spilt();

        // JDK动态代理：代理接口
        IAnimale iAnimale = InterfaceInvocationHandler.newProxyInstance(IAnimale.class);
        iAnimale.eat("三文鱼");
    }
}
