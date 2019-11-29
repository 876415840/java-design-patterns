package com.alan.model.behavior.visitor.domain;

/**
 * @Description: 具体元素B类
 * @Author MengQingHao
 * @Date 2019/11/29 2:18 下午
 * @Version 1.0
 */
public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B的操作";
    }
}
