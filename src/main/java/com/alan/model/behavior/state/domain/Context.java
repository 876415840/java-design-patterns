package com.alan.model.behavior.state.domain;

/**
 * @Description: 环境类
 * @Author MengQingHao
 * @Date 2019/11/26 2:24 下午
 * @Version 1.0
 */
public class Context {

    private State state;

    /**
     * 定义环境类的初始状态
     */
    public Context() {
        this.state = new ConcreteStateA();
    }

    public void handle() {
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
