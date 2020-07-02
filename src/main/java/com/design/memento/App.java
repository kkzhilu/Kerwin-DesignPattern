package com.design.memento;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/28 23:50
 * description:  备忘录模式 测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象,备忘录模式属于行为型模式
     *
     * 意图
     *     在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态
     *
     * 主要解决
     *     所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态
     *
     * 何时使用
     *     很多时候我们总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到他原先的状态，使得他有"后悔药"可吃
     *
     *     关键代码：客户不与备忘录类耦合，与备忘录管理类耦合。
     *
     * 思想应用实例
     *     1、后悔药
     *     2、打游戏时的存档
     *     3、Windows 里的 ctri + z
     *     4、数据库的事务管理
     *
     * 关键代码
     *     1.数据可能经常变化的Bean 或者 其他数据结构
     *     2.备忘录 -> 数据格式取决于用什么类型存储
     *     3.存储备忘录的数据格式,更多的时候不需要专门创建该对象 (调用出或者bean 构建数据格式存取即可)
     */
    public static void main(String[] args) throws InterruptedException {

        // 创建备忘录管理者
        MementoTaker mementoTaker = new MementoTaker();


        MessageData messageData = new MessageData();
        messageData.setTime(System.currentTimeMillis() + "");
        messageData.setMessage("This is messgae first.");
        mementoTaker.add(messageData.saveMemento());

        System.out.println("First: -> " + messageData);

        Thread.sleep(2000);

        messageData.setTime(System.currentTimeMillis() + "");
        messageData.setMessage("This is messgae second.");
        mementoTaker.add(messageData.saveMemento());

        System.out.println("Second: -> " + messageData);

        Thread.sleep(2000);

        // 回复初次状态
        messageData.getFromMemento(mementoTaker.get(0));

        System.out.println("********************检测数据是否回到初始状态******************");
        System.out.println(messageData);
    }
}
