package com.design.observer.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 23:02
 * description:  主题 | 目标
 * version:      V1.0
 * ******************************
 */
public interface Subject {

    // add observer
    void attach(Observer observer);

    // remove observer
    void detach(Observer observer);

    // send notify to observers
    void sendNotify();
}
