package com.alan.model.gof23.behavior.iterator.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 具体聚合
 * @Author MengQingHao
 * @Date 2019/11/27 4:00 下午
 * @Version 1.0
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> list=new ArrayList<Object>();

    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
