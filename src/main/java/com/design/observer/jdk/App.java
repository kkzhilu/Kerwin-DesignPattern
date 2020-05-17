package com.design.observer.jdk;

/**
 * ******************************
 * author：      柯贤铭
 * createTime:   2020/2/2 21:02
 * description:  App
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 推荐代码阅读顺序：
     * @see ObservableApp
     * @see ObserverA
     */
    public static void main(String[] args) throws InterruptedException {
        ObservableApp app = new ObservableApp(System.currentTimeMillis());
        System.out.println(app.getCurr());
        app.addObserver(new ObserverA());
        app.addObserver(new ObserverB());

        Thread.sleep(1000);
        long curr = System.currentTimeMillis();
        app.change(curr);
        System.out.println(app.getCurr());
    }
}
