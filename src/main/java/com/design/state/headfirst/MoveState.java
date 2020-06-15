package com.design.state.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 1:08
 * description:  移动状态
 * version:      V1.0
 * ******************************
 */
public class MoveState implements State{

    Context context;

    public MoveState(Context context) {
        this.context = context;
    }

    @Override
    public void move() {
        System.out.println("正在移动滑杆, 确认！");
        changeState();
    }

    @Override
    public void changeState() {
        context.setExecute(new GrabState(context));
    }
}
