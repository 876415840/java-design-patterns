package com.alan.model.gof23.structure.bridge.domain;

/**
 * @Description: 抽象化角色
 * @Author MengQingHao
 * @Date 2019/11/21 5:27 下午
 * @Version 1.0
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * @Description: 操作
     * @author MengQingHao
     * @date 2019/11/21 5:33 下午
     * @version 1.0
     */
    public abstract void operation();
}
