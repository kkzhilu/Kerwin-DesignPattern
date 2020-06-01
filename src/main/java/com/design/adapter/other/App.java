package com.design.adapter.other;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/1 14:35
 * description:  接口适配器 App
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 接口适配器, 对接口进行适配器策略，可以大大减少需要重写的方法（需要用什么就重写什么）
     * JDK中的接口适配器Demo:
     * @see MouseListener
     * @see MouseAdapter
     *
     * 推荐阅读顺序：
     * @see InterfaceClass
     * @see InterfaceAdapter
     */
    public static void main(String[] args){

        new InterfaceAdapter(){}.a();

        new InterfaceAdapter(){
            @Override
            public void b() {
                System.out.println("I am b.");
            }
        }.b();
    }
}
