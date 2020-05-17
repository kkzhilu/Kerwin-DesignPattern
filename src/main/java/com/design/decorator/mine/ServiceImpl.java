package com.design.decorator.mine;

import java.util.Map;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/15 12:08
 * description:  具体业务层 - concrete-component
 * version:      V1.0
 * ******************************
 */
public class ServiceImpl implements Service {

    @Override
    public void handleEvent(String eventId, Map<String, Object> map) {
        System.out.println("eventId: -> " + eventId);
        System.out.println("map:     -> " + map);
        System.out.println("this is serviceImpl event handle.");
    }
}
