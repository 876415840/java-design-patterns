package com.alan.model.behavior.mediator.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体同事类3
 * @Author MengQingHao
 * @Date 2019/11/26 5:13 下午
 * @Version 1.0
 */
public class ConcreteColleague3 extends Colleague {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteColleague3.class);

    @Override
    public void receive() {
        LOGGER.info("具体同事类3接收请求。。。。");
    }

    @Override
    public void send() {
        LOGGER.info("具体同事类3通过中介者发出请求。。。。");
        mediator.relay(this);
    }
}
