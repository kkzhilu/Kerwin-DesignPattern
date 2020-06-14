package com.design.template.headfirst;

import com.design.utils.CodeUtils;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/7/30 9:36
 * description:  模板方法模式-测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 总结
     *    模板方法模式的核心即：
     *    在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中，使得子类可以不改变算法结构的情况下，重定义该算法中的某些特定步骤
     *
     * 推荐阅读顺序：
     *
     * @see TemplateClass
     * @see BaoCai
     * @see SuanRong
     */
    public static void main(String[] args){
        BaoCai baoCai = new BaoCai();
        baoCai.cookProcess();

        CodeUtils.spilt();

        SuanRong suanRong = new SuanRong();
        suanRong.cookProcess();
    }
}
