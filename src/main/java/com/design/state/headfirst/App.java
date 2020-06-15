package com.design.state.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 1:25
 * description:  状态模式测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 推荐代码阅读顺序：
     *
     * @see State
     * @see MoneyState | MoveState | GrabState
     * @see Context
     */
    public static void main(String[] args) {
        Context context = new Context();
        context.giveMoney();
        context.move();
        context.grab();

        context.grab();
        context.move();
        context.giveMoney();
    }
}
