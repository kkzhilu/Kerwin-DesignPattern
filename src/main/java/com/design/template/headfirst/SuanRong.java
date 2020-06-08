package com.design.template.headfirst;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/08 23:50
 * description:  蒜蓉模板
 * version:      V1.0
 * ******************************
 */
public class SuanRong extends TemplateClass {

	@Override
	boolean needSauce() {
		return false;
	}

	@Override
	void pourVegetable() {
		System.out.println("下锅的蔬菜是菜心");
	}

	@Override
	void pourSauce() {
		System.out.println("下锅的酱料是蒜蓉");
	}
}
