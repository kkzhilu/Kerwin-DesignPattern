package com.design.observer.headfirst;

import java.util.ArrayList;
import java.util.List;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 23:04
 * description:  具体目标，将有关状态存入具体观察者对象；
 *               当内部状态改变时，给所有登记过的观察者发出通知。
 *               具体目标通常用一个具体子类实现
 * version:      V1.0
 * ******************************
 */
public class WeChatSubject implements Subject {

    List<Observer> observers = new ArrayList<>();

    void doSomething() {
        // 模拟业务逻辑操作
        System.out.println("假装我发了一篇公众号~");
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendNotify() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
