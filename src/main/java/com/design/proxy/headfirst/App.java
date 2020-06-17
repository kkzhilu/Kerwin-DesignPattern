package com.design.proxy.headfirst;

import com.design.utils.CodeUtils;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 15:43
 * description:  静态代理测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 代理模式之静态代理
     *
     * 推荐代码阅读顺序:
     * @see PhoneInterface
     * @see PhoneServiceImpl
     * @see PhoneServiceProxy
     */
    public static void main(String[] args) {
        PhoneInterface proxy = new PhoneServiceProxy(new PhoneServiceImpl());
        proxy.updatePhone(15186564812L);

        CodeUtils.spilt();

        proxy.updatePhone(null);
    }
}
