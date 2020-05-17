package com.design.observer.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 23:05
 * description:  具体观察者:实现抽象观察者角色所要求的更新接口，已是本身状态与主题状态相协调
 * version:      V1.0
 * ******************************
 */
public class FansObserver implements Observer {


    public String name;

    @Override
    public void update() {
        System.out.println("fans " + this.name + " has get notice");
    }


    /********************* 不重要 ********************/
    public FansObserver (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
