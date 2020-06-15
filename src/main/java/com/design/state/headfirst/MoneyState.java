package com.design.state.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 1:08
 * description:  投币状态
 * version:      V1.0
 * ******************************
 */
public class MoneyState implements State{

    Context context;

    public MoneyState(Context context) {
        this.context = context;
    }

    @Override
    public void giveMoney() {
        System.out.println("已投币!");
        changeState();
    }

    @Override
    public void changeState() {
        context.setExecute(new MoveState(context));
    }
}
