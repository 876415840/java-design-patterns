package com.alan.model.create.abs.factory.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 类型1产品的具体产品2
 * @Author MengQingHao
 * @Date 2019/11/7 5:12 下午
 * @Version 1.0
 */
public class ConcreteProduct12 implements Product1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteProduct12.class);

    @Override
    public void show() {
        LOGGER.info("---------我是类型1产品的具体产品2---------");
    }
}
