package com.design.proxy.jdk.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.MessageFormat;
import java.util.Arrays;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/25 21:09
 * description:  MybatisInvocation 接口代理器
 * version:      V1.0
 * ******************************
 */
public class MybatisInvocation implements InvocationHandler {

    /**
     * 代理指定的接口
     * @param tClass 接口class
     * @param <T>    接口类型
     */
    @SuppressWarnings("unchecked")
    public static  <T> T newProxyInstance(Class<T> tClass) {
        return (T) Proxy.newProxyInstance(tClass.getClassLoader(), new Class[]{tClass}, new MybatisInvocation());
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(Select.class)) {
            Select select = method.getAnnotation(Select.class);
            System.out.println(MessageFormat.format("Method Name: {0} , Annotation Value is: {1}", method.getName(), select.value()));
        }

        // 获取到SQL及参数, 即可通过JDBC进行数据库操作查询数据, MyBatis不再神秘
        return Arrays.asList("I", " am", " Kerwin~");
    }
}
