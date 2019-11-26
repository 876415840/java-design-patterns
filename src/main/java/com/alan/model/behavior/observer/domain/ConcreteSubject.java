package com.alan.model.behavior.observer.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体目标
 * @Author MengQingHao
 * @Date 2019/11/26 2:41 下午
 * @Version 1.0
 */
public class ConcreteSubject extends Subject {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteSubject.class);

    @Override
    public void notifyObserver() {
        LOGGER.info("具体目标发生改变。。通知观察者\n----------------------------------------------");
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
