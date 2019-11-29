package com.alan.model.gof23.behavior.iterator.domain;

import java.util.List;

/**
 * @Description: 具体迭代器
 * @Author MengQingHao
 * @Date 2019/11/27 4:05 下午
 * @Version 1.0
 */
public class ConcreteIterator implements Iterator {

    private List<Object> list=null;
    private int index=-1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return list.get(++index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        }
        return false;
    }
}
