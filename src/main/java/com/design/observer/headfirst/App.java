package com.design.observer.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 23:01
 * description:  观察者模式 App
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 推荐代码阅读顺序：
     * @see Subject        #观察者模式的核心所在
     * @see Observer
     * @see WeChatSubject
     * @see FansObserver
     */
    public static void main(String[] args){
        // build the object of subject
        WeChatSubject subject = new WeChatSubject();
        // add observer for the object of subject
        subject.attach(new FansObserver("Tom"));
        subject.attach(new FansObserver("ZhuDi"));
        subject.attach(new FansObserver("Mark"));

        // 模拟一个业务场景
        if ((Math.random() * 11 > 3)) {
            System.out.println("WeChat 只是执行普通业务操作... ");
            subject.doSomething();
        } else {
            System.out.println("WeChat 触发发送通知机制... ");
            subject.doSomething();
            subject.sendNotify();
        }
    }
}
