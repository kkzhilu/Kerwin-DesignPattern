package com.design.decorator.mine;

import java.util.Map;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/15 13:58
 * description:  具体业务层 - concrete-component - clean任务
 * version:      V1.0
 * ******************************
 */
public class CleanImplDecorator implements Service {

    Service service;

    public CleanImplDecorator (Service service) {
        this.service = service;
    }

    @Override
    public void handleEvent(String eventId, Map<String, Object> map) {
        service.handleEvent(eventId, map);
        System.out.println("************************************************");
        System.out.println("this is CleanImpl, just for clean for eventId...");
    }
}
