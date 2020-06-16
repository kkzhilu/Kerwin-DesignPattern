package com.design.proxy.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 15:36
 * description:  PhoneServiceImpl 业务层
 * version:      V1.0
 * ******************************
 */
public class PhoneServiceImpl implements PhoneInterface{

    @Override
    public void updatePhone(Long phoneNum) {
        System.out.println("update phoneNum is: -> " + phoneNum);
    }
}
