package com.design.builder.mine;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/6 17:48
 * description:  MyBuilder 测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    public static void main(String[] args){
        MyBuilder myBuilder = new MyBuilder();
        System.out.println(myBuilder);

        myBuilder.withName("Kerwin").withSex("男").withYear("1996");
        System.out.println(myBuilder);
    }
}
