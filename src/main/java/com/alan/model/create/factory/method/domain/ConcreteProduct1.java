package com.alan.model.create.factory.method.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 具体产品1
 * @Author MengQingHao
 * @Date 2019/11/6 12:05 下午
 * @Version 1.0
 */
public class ConcreteProduct1 implements Product {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteProduct1.class);

    @Override
    public void show() {
        LOGGER.info("---------我是具体产品1---------");
    }
}
