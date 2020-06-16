package com.design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.MessageFormat;
import java.util.Arrays;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/25 21:09
 * description:  InterfaceInvocationHandler 接口代理器
 * version:      V1.0
 * ******************************
 */
public class InterfaceInvocationHandler implements InvocationHandler {

    /**
     * 代理指定的接口
     * @param tClass 接口class
     * @param <T>    接口类型
     */
    @SuppressWarnings("unchecked")
    public static  <T> T newProxyInstance(Class<T> tClass) {
        return (T) Proxy.newProxyInstance(tClass.getClassLoader(), new Class[]{tClass}, new InterfaceInvocationHandler());
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(MessageFormat.format("Method Name: {0} , Params: {1}", method.getName(), Arrays.toString(args)));
        new Cat().eat((String) args[0]);
        return null;
    }
}
