package com.design.template.headfirst;


/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/08 23:50
 * description:  模板方法模式 抽象类
 * version:      V1.0
 * ******************************
 */
public abstract class TemplateClass {

	/***
	 * 模板方法，用来控制炒菜的流程 （炒菜的流程是一样的-复用）
	 * 可根据需求申明为final，防止子类覆盖这个方法，导致流程的执行顺序
	 */
	final void cookProcess() {

		// 第一步：倒油
		this.pourOil();

		// 第二步：热油
		this.heatOil();

		// 第三步：倒蔬菜
		this.pourVegetable();

		// 配合钩子函数, 确定是否需要倒调味料
		if (needSauce()) {
			this.pourSauce();
		}

		// 第五步：翻炒
		this.fry();
	}


	void pourOil() {
		System.out.println("倒油");
	}


	void heatOil() {
		System.out.println("热油");
	}

	/***
	 * 需要变化的部分就定义为抽象
	 */
	abstract void pourVegetable();

	/***
	 * 需要变化的部分就定义为抽象
	 */
	abstract void pourSauce();

	/***
	 * 钩子函数, 影响方法调用逻辑
	 */
	boolean needSauce() {
		return true;
	}

	void fry() {
		System.out.println("炒啊炒啊炒到熟啊");
	}
}
