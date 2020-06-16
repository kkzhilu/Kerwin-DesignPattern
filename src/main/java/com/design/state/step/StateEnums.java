package com.design.state.step;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 12:59
 * description:  状态枚举类
 * version:      V1.0
 * ******************************
 */
public enum StateEnums {

    HANDLE_ORDER    (1, "订单处理"),
    SUCCESS_ORDER   (2, "处理订单成功"),
    FAIL_ORDER      (3, "处理订单失败");

    private Integer value;

    private String  descr;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    StateEnums(Integer value, String descr) {
        this.value = value;
        this.descr = descr;
    }
}
