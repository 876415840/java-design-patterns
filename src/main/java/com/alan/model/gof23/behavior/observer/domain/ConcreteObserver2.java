package com.alan.model.gof23.behavior.observer.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体观察者2
 * @Author MengQingHao
 * @Date 2019/11/26 2:43 下午
 * @Version 1.0
 */
public class ConcreteObserver2 implements Observer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteObserver2.class);

    @Override
    public void response() {
        LOGGER.info("具体观察者2做出反应");
    }
}
