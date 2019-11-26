package com.alan.model.behavior.observer.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 抽象目标
 * @Author MengQingHao
 * @Date 2019/11/26 2:37 下午
 * @Version 1.0
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<Observer>();

    /**
     * 添加观察者
     * @param observer
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者方法
     */
    public abstract void notifyObserver();
}
