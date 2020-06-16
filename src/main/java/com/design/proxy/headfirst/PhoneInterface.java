package com.design.proxy.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/21 14:23
 * description:  业务层接口
 * version:      V1.0
 * ******************************
 */
public interface PhoneInterface {

    /***
     * 更新电话号码
     * @param phoneNum    电话号码
     * @throws Exception  可能抛出Exception 异常
     */
    void updatePhone(Long phoneNum);
}
