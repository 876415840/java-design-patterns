package com.alan.model.gof23.behavior.mediator.domain;

/**
 * @Description: 抽象中介者
 * @Author MengQingHao
 * @Date 2019/11/26 5:08 下午
 * @Version 1.0
 */
public abstract class Mediator {

    /**
     * 注册同事对象
     * @param colleague
     */
    public abstract void register(Colleague colleague);

    /**
     * 转发
     * @param cl
     */
    public abstract void relay(Colleague cl);
}
