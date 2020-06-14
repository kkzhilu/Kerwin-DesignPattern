package com.design.facade;

import com.design.utils.CodeUtils;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/3 0:47
 * description:  外观模式App测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /****
     * 推荐阅读顺序：
     *
     * @see Computer
     * @see Cpu | Ram | Ssd
     * @see FacadeComputer
     */
    public static void main(String[] args) {
        // 不使用外观模式
        Computer cpu = new Cpu();
        Computer ram = new Ram();
        Computer ssd = new Ssd();
        cpu.open();
        ram.open();
        ssd.open();

        CodeUtils.spilt();

        // 使用外观模式
        FacadeComputer facadeComputer = new FacadeComputer();
        facadeComputer.allOn();
    }
}
