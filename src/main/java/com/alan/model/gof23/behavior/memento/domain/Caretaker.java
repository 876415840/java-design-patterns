package com.alan.model.gof23.behavior.memento.domain;

/**
 * @Description: 管理者
 * @Author MengQingHao
 * @Date 2019/11/29 4:42 下午
 * @Version 1.0
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
