package com.alan.model.behavior.visitor.domain;

/**
 * @Description: 抽象元素
 * @Author MengQingHao
 * @Date 2019/11/29 2:14 下午
 * @Version 1.0
 */
public interface Element {

    void accept(Visitor visitor);
}
