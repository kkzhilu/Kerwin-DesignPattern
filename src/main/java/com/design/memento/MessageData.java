package com.design.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/28 23:51
 * description:  备忘录模式 模拟短信场景
 * version:      V1.0
 * ******************************
 */
public class MessageData {

    private String time;

    private String message;

    /**
     * 存储数据
     */
    public Memento saveMemento () {
        Map<String, String> map = new HashMap<>();
        map.put("TIME",    time);
        map.put("MESSAGE", message);
        return new Memento(map);
    }

    /**
     * 取出数据
     */
    public void getFromMemento(Memento memento){
        time    = memento.getData().get("TIME");
        message = memento.getData().get("MESSAGE");
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MessageData{" +
                "time='" + time + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
