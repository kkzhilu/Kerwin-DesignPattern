package com.design.composite;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/6/14 23:31
 * description:  组合模式测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 推荐代码阅读顺序：
     *
     * @see MenuComponent
     * @see Menu
     * @see MentItem
     *
     * 当前菜单项: 炒菜类
     *     食物名: 宫保鸡丁
     *     食物名: 剁椒鸡蛋
     *     食物名: 鱼香肉丝
     * 当前菜单项: 素食
     *     食物名: 酸辣土豆丝
     *     食物名: 爆炒包菜
     */
    public static void main(String[] args) {
        Menu meat = new Menu("炒菜类");

        MentItem item1 = new MentItem("宫保鸡丁");
        MentItem item2 = new MentItem("剁椒鸡蛋");
        MentItem item3 = new MentItem("鱼香肉丝");

        Menu vegetable = new Menu("素食");
        MentItem v1 = new MentItem("酸辣土豆丝");
        MentItem v2 = new MentItem("爆炒包菜");

        meat.add(item1);
        meat.add(item2);
        meat.add(item3);

        vegetable.add(v1);
        vegetable.add(v2);

        meat.add(vegetable);

        meat.print();
    }
}
