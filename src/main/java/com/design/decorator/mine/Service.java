package com.design.decorator.mine;

import java.util.Map;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/15 12:04
 * description:  上层接口 - component
 * version:      V1.0
 * ******************************
 */
public interface Service {

    void handleEvent(String eventId, Map<String, Object> map);
}
