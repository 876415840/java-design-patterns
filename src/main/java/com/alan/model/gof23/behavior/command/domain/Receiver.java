package com.alan.model.gof23.behavior.command.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 接收者
 * @Author MengQingHao
 * @Date 2019/11/26 12:08 下午
 * @Version 1.0
 */
public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    public void action() {
        LOGGER.info("接受者action()方法被调用。。。");
    }
}
