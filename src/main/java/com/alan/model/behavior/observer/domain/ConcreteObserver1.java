package com.alan.model.behavior.observer.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体观察者1
 * @Author MengQingHao
 * @Date 2019/11/26 2:43 下午
 * @Version 1.0
 */
public class ConcreteObserver1 implements Observer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteObserver1.class);

    @Override
    public void response() {
        LOGGER.info("具体观察者1做出反应");
    }
}
