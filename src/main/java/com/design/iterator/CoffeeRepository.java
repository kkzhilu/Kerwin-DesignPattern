package com.design.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/2 9:48
 * description:  实体类
 * version:      V1.0
 * ******************************
 */
public class CoffeeRepository implements MyContainer {

    List<String> names = Arrays.asList("雀巢咖啡", "黑糖玛奇朵", "半点寂寞");

    @Override
    public MyIterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements MyIterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < names.size();
        }

        @Override
        public Object next() {
           return hasNext() ? names.get(index++) : null;
        }

        NameIterator() {
            index = 0;
        }
    }
}
