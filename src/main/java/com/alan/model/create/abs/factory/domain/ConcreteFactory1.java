package com.alan.model.create.abs.factory.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体工厂1
 * @Author MengQingHao
 * @Date 2019/11/7 5:18 下午
 * @Version 1.0
 */
public class ConcreteFactory1 implements AbstractFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteFactory1.class);

    @Override
    public Product1 newProduct1() {
        LOGGER.info("======工厂1->生产->具体产品1===类型1====");
        return new ConcreteProduct11();
    }

    @Override
    public Product2 newProduct2() {
        LOGGER.info("======工厂1->生产->具体产品1===类型2====");
        return new ConcreteProduct21();
    }
}
