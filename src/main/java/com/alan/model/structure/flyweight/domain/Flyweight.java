package com.alan.model.structure.flyweight.domain;

/**
 * @Description: 抽象享元角色
 * @Author MengQingHao
 * @Date 2019/11/22 6:39 下午
 * @Version 1.0
 */
public interface Flyweight {

    /**
     * 操作
     * @param state
     */
    void operation(UnsharedConcreteFlyweight state);
}
