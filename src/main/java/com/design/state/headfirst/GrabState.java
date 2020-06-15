package com.design.state.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 1:08
 * description:  抓取状态
 * version:      V1.0
 * ******************************
 */
public class GrabState implements State{

    Context context;

    public GrabState(Context context) {
        this.context = context;
    }

    @Override
    public void grab() {
        System.out.println("抓取娃娃!");
        changeState();
    }

    @Override
    public void changeState() {
        context.setExecute(new MoneyState(context));
    }
}
