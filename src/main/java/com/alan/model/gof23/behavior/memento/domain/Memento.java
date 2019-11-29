package com.alan.model.gof23.behavior.memento.domain;

/**
 * @Description: 备忘录
 * @Author MengQingHao
 * @Date 2019/11/29 4:38 下午
 * @Version 1.0
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
