package com.design.proxy.headfirst;

import java.text.MessageFormat;
import java.util.Date;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/16 15:38
 * description:  PhoneServiceProxy Phone 代理类
 * version:      V1.0
 * ******************************
 */
public class PhoneServiceProxy implements PhoneInterface {

    private PhoneInterface phoneInterface;

    public PhoneServiceProxy(PhoneInterface phoneInterface) {
        this.phoneInterface = phoneInterface;
    }

    @Override
    public void updatePhone(Long phoneNum) {
        before(phoneNum);
        phoneInterface.updatePhone(phoneNum);
        after();
    }

    private void before(Long phoneNum) {
        System.out.println(MessageFormat.format("log start time:{0} , phoneNum is: {1}", new Date(), phoneNum));
        if (null == phoneNum || String.valueOf(phoneNum).length() != 11) {
            throw new RuntimeException("Update phoneNum fail, phoneNum is wrong.");
        }
    }

    private void after() {
        System.out.println(MessageFormat.format("log end time:{0}", new Date()));
    }
}
