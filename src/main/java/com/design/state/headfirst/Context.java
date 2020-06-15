package com.design.state.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 1:09
 * description:  Context 上下文，维持状态变更
 * version:      V1.0
 * ******************************
 */
public class Context {

    // 起始状态
    private State moneyState;

    private State execute;

    public Context() {
        moneyState = new MoneyState(this);
        this.execute = moneyState;
    }

    public void giveMoney() {
        this.execute.giveMoney();
    }

    public void move() {
        this.execute.move();
    }

    public void grab() {
        this.execute.grab();
    }

    public void setExecute(State execute) {
        this.execute = execute;
    }
}
