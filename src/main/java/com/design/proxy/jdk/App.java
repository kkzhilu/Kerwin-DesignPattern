package com.design.proxy.jdk;

import com.design.proxy.jdk.mybatis.MyBatis;
import com.design.proxy.jdk.mybatis.MybatisInvocation;
import com.design.proxy.jdk.mybatis.Select;
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

    /***
     * JDK 动态代理
     *
     * 注意事项:
     *     1.JDK动态代理的本质是创造一个实现了同一个接口的Proxy代理类，去进行真正的调用，只不过创造代理类的过程被底层隐藏了
     *     2.JDK动态代理在实现中的本质是反射技术
     *     3.由于所有的代理类都实现了Proxy.class -> 包括帮我们创造的代理类也是，因此由于JAVA单继承的特点，只能想要实现代理必须实现某一个接口
     *
     * 关键代码：
     *     1.代理类需要实现InvocationHandler接口，并拥有一个需要代理的实例对象
     *     2.真正调用时通过Proxy类进行调用  传递参数为：实现类类加载器，接口Class[]数组，以及实例化的处理器（InvokeHandler）
     *
     * 推荐代码阅读顺序：
     *
     * @see IAnimale
     * @see Cat
     * @see AnimalInvocationHandler
     *
     * MyBatis 代理接口Demo:
     *
     * @see Select
     * @see MyBatis
     * @see MybatisInvocation
     */
    public static void main(String[] args) {

        // 代理子类实现
        IAnimale cat = (IAnimale) Proxy.newProxyInstance(Cat.class.getClassLoader(),
                new Class[]{IAnimale.class}, new AnimalInvocationHandler(new Cat()));
        cat.eat("猫粮");

        CodeUtils.spilt();

        // JDK动态代理：模拟 MyBatis 核心代理阶段
        MyBatis batis = MybatisInvocation.newProxyInstance(MyBatis.class);
        System.out.println("Result:" + batis.select());
    }
}
