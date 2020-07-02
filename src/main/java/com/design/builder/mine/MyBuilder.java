package com.design.builder.mine;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/6 17:36
 * description:  MyBuilder - 并非建造者模式，但是构建场景也比较实用
 *               1.减少代码
 *               2.可以增加默认配置
 * version:      V1.0
 * ******************************
 */
public class MyBuilder {

    public MyBuilder () {
        this.setName("default name");
        this.setYear("default year");
        this.setSex("default sex");
    }

    private String name;

    private String year;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    MyBuilder withName(String name) {
        this.setName(name);
        return this;
    }


    MyBuilder withYear(String year) {
        this.setYear(year);
        return this;
    }


    MyBuilder withSex(String sex) {
        this.setSex(sex);
        return this;
    }

    @Override
    public String toString() {
        return "MyBuilder{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
