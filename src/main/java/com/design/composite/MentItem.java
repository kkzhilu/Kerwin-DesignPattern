package com.design.composite;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/14 23:29
 * description:  具体，即叶子
 * version:      V1.0
 * ******************************
 */
public class MentItem extends MenuComponent{

    public MentItem(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) throws Exception {
        throw new Exception("无法添加");
    }

    @Override
    public void remove(MenuComponent component) throws Exception {
        throw new Exception("无法移除");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public MenuComponent getChild(int i) throws Exception {
        throw new Exception("无子节点");
    }

    @Override
    public void print() {
        System.out.println("    食物名: " + getName());
    }
}
