package com.design.observer.headfirst;

/**
 * ******************************
 * author：      柯贤铭
 * createTime:   2019/8/1 23:03
 * description:  观察者，为所有具体观察者定义一个接口，在得到通知时更新自己
 * version:      V1.0
 * ******************************
 */
public interface Observer {

    /***
     * 更新通知
     */
    void update();
}
