package com.design.chain.mine;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/1 17:08
 * description:  错误级别枚举类
 * version:      V1.0
 * ******************************
 */
public enum LogerEnums {

    INFO    (1, "INFO级别错误"),
    DEBUG   (2, "DEBUG级别错误"),
    ERROR   (3, "ERROR级别错误");

    private int    value;
    private String desc;

    LogerEnums(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
