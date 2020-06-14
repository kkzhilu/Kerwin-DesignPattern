package com.design.iterator;

import com.design.observer.headfirst.Observer;
import com.design.observer.headfirst.Subject;
import com.design.utils.CodeUtils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/2 9:26
 * description:  迭代器模式测试类
 * version:      V1.0
 * ******************************
 */
public class App {

    /***
     * 推荐代码阅读顺序：
     *
     * @see MyContainer
     * @see MyIterator
     * @see CoffeeRepository | FoodRepository
     */
    public static void main(String[] args){
        // 餐厅菜单
        FoodRepository food = new FoodRepository();
        MyIterator foodIterator = food.getIterator();
        while (foodIterator.hasNext()) {
            System.out.println("Food: -> " + foodIterator.next());
        }

        CodeUtils.spilt();

        // 咖啡菜单
        CoffeeRepository coffee = new CoffeeRepository();
        MyIterator coffeeIterator = coffee.getIterator();
        while (coffeeIterator.hasNext()) {
            System.out.println("Coffee: -> " + coffeeIterator.next());
        }

        CodeUtils.spilt();

        // JDK
        List<String> names = Arrays.asList("Han", "John", "Tomams");
        Iterator<String> iterable = names.iterator();
        while (iterable.hasNext()) {
            System.out.println("JDK Iterator: -> " + iterable.next());
        }

        CodeUtils.spilt();

        // JDK
        names.forEach(s -> System.out.println("JDK forEach: -> " + s));
    }
}
