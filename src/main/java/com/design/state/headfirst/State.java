package com.design.state.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 1:04
 * description:  状态接口 | 为了简单一点，我只定义三种状态
 * version:      V1.0
 * ******************************
 */
public interface State {

    /** 投币 **/
    default void giveMoney() {
        System.out.println("无法投币");
    }

    /** 移动滑杆 **/
    default void move() {
        System.out.println("无法移动滑杆");
    }

    /** 抓取 **/
    default void grab() {
        System.out.println("无法抓取");
    }

    void changeState();
}
