package com.lzb.behavior.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author : LZB
 * @Description :迭代器模式（Iterator Pattern）：提供一种方法访问一个容器对象中各个元素，而又不需暴露该对象的内部细节。
 */
public class MyList implements Iterable<String> {
    private List<String> data = Arrays.asList("a", "b", "c", "d", "e", "f");

    @Override
    public Iterator<String> iterator() {
        // 每次生成一个新的迭代器，用于遍历列表
        return new Itr();
    }

    private class Itr implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.size();
        }

        @Override
        public String next() {
            return data.get(index++);
        }
    }
}
