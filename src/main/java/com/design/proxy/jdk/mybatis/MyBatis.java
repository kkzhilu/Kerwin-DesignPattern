package com.design.proxy.jdk.mybatis;

import java.util.List;

/**
 * ******************************
 * author：      柯贤铭
 * createTime:   2020/6/17 14:39
 * description:  MyBatis Demo.
 * version:      V1.0
 * ******************************
 */
public interface MyBatis {

    @Select("select * from demo")
    List<String> select();
}
