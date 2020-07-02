package com.design.memento;

import java.util.Map;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/28 23:51
 * description:  备忘录 - 确定数据格式即可
 * version:      V1.0
 * ******************************
 */
public class Memento {

    Map<String, String> data;

    public Memento (Map<String, String> data) {
        this.data = data;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}
