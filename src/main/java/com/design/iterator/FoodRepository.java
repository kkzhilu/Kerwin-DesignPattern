package com.design.iterator;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/8/2 9:48
 * description:  实体类
 * version:      V1.0
 * ******************************
 */
public class FoodRepository implements MyContainer {

    String[] names = {"宫保鸡丁", "麻辣香锅", "油闷大虾"};

    @Override
    public MyIterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements MyIterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
           return hasNext() ? names[index++] : null;
        }

        NameIterator() {
            index = 0;
        }
    }
}
