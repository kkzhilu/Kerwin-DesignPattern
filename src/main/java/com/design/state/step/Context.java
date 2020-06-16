package com.design.state.step;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 12:50
 * description:  上下文, 执行者 持有 "状态"对象
 * version:      V1.0
 * ******************************
 */
public class Context {

    /**
     * 最大执行次数
     */
    public static final Integer FAIL_NUM = 3;

    /***
     * 失败次数
     */
    private int failNum;

    /**
     * 是否继续执行的标识
     */
    private boolean isAbandon;

    /***
     * 当前状态
     */
    private StateInterface stateInterface;

    public Context() {
        this.stateInterface = new HandleOrder();
        this.failNum = 1;
        this.isAbandon = false;
    }

    /***
     * 处理方法
     */
    public void handle () {
        stateInterface.doAction(this);
    }

    public int getFailNum() {
        return failNum;
    }

    public void setFailNum(int failNum) {
        this.failNum = failNum;
    }

    public boolean isAbandon() {
        return isAbandon;
    }

    public void setAbandon(boolean abandon) {
        isAbandon = abandon;
    }

    public StateInterface getStateInterface() {
        return stateInterface;
    }

    public void setStateInterface(StateInterface stateInterface) {
        this.stateInterface = stateInterface;
    }
}
