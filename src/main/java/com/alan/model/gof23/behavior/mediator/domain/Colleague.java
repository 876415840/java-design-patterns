package com.alan.model.gof23.behavior.mediator.domain;

/**
 * @Description: 抽象同事类
 * @Author MengQingHao
 * @Date 2019/11/26 5:09 下午
 * @Version 1.0
 */
public abstract class Colleague {

    protected Mediator mediator;

    /**
     * 接收
     */
    public abstract void receive();

    /**
     * 发送
     */
    public abstract void send();

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
