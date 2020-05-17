package com.design.observer.jdk;

import java.util.Observable;

/**
 * ******************************
 * author：      柯贤铭
 * createTime:   2020/2/2 21:02
 * description:  具体目标
 * version:      V1.0
 * ******************************
 */
public class ObservableApp extends Observable {

    private long curr;

    ObservableApp(long curr) {
        this.curr = curr;
    }

    void change(long newStr) {
        this.curr = newStr;

        // 更改通知状态
        setChanged();
        notifyObservers(newStr);
    }

    long getCurr() {
        return curr;
    }

    void setCurr(long curr) {
        this.curr = curr;
    }
}
