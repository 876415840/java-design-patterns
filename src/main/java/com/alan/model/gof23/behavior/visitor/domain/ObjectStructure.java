package com.alan.model.gof23.behavior.visitor.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description: 对象结构角色
 * @Author MengQingHao
 * @Date 2019/11/29 2:23 下午
 * @Version 1.0
 */
public class ObjectStructure {

    private List<Element> list=new ArrayList<Element>();

    public void accept(Visitor visitor) {
        Iterator<Element> i=list.iterator();
        while (i.hasNext()) {
            i.next().accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
