package com.design.facade;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/3 0:53
 * description:  外观模式
 * version:      V1.0
 * ******************************
 */
public class FacadeComputer {

    private Cpu cpu;
    private Ram ram;
    private Ssd ssd;

    public FacadeComputer() {
        this.cpu = new Cpu();
        this.ram = new Ram();
        this.ssd = new Ssd();
    }

    /** Cpu On **/
    public void onCpu() {
        this.cpu.open();
    }

    /** Ram On **/
    public void onRam() {
        this.ram.open();
    }

    /** Ssd On **/
    public void onSsd() {
        this.ssd.open();
    }

    /** All On **/
    public void allOn() {
        this.cpu.open();
        this.ram.open();
        this.ssd.open();
    }
}
