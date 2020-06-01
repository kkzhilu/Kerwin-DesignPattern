package com.design.decorator.mine;

import com.design.utils.CodeUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/15 14:00
 * description:  装饰模式 - mine 测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 模拟真实工作情况 - service层接口定义完毕，现有ServiceImpl及CleanImpl两个service
     * 在不修改service代码的情况下，为serviceImpl增加clean的功能
     *
     * 即以ServiceImpl为核心，为其装饰CleanImpl功能, 增强handle的功能
     *
     * 推荐阅读顺序：
     *
     * @see Service
     * @see ServiceImpl
     * @see CleanImplDecorator
     */
    public static void main(String[] args){
        Map<String, Object> map = new HashMap<>();
        map.put("key", "Somethings...");

        String eventId = UUID.randomUUID().toString();

        Service service = new ServiceImpl();
        service.handleEvent(eventId, map);

        CodeUtils.spilt();

        service = new CleanImplDecorator(service);
        service.handleEvent(eventId, map);
    }
}
