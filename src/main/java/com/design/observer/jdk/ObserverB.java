package com.design.observer.jdk;

import java.text.MessageFormat;
import java.util.Observable;
import java.util.Observer;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/2/2 21:04
 * description:  具体观察者 B
 * version:      V1.0
 * ******************************
 */
public class ObserverB implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(MessageFormat.format("ObserverB -> {0} changed, Begin to Work. agr is:{1}", o.getClass().getSimpleName(), arg));
    }
}
