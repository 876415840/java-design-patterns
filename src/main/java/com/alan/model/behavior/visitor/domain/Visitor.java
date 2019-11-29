package com.alan.model.behavior.visitor.domain;

/**
 * @Description: 抽象访问者
 * @Author MengQingHao
 * @Date 2019/11/29 2:13 下午
 * @Version 1.0
 */
public interface Visitor {

    /**
     * 访问A元素
     * @param element
     */
    void visit(ConcreteElementA element);

    /**
     * 访问B元素
     * @param element
     */
    void visit(ConcreteElementB element);
}
