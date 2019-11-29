package com.alan.model.behavior.visitor.domain;

/**
 * @Description: 具体元素A类
 * @Author MengQingHao
 * @Date 2019/11/29 2:18 下午
 * @Version 1.0
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作";
    }
}
