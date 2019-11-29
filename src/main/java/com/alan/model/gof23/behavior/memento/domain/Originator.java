package com.alan.model.gof23.behavior.memento.domain;

/**
 * @Description: 发起人
 * @Author MengQingHao
 * @Date 2019/11/29 4:38 下午
 * @Version 1.0
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
