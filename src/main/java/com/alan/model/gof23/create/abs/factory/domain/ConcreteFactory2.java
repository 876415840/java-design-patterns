package com.alan.model.gof23.create.abs.factory.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体工厂2
 * @Author MengQingHao
 * @Date 2019/11/7 5:18 下午
 * @Version 1.0
 */
public class ConcreteFactory2 implements AbstractFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteFactory2.class);

    @Override
    public Product1 newProduct1() {
        LOGGER.info("======工厂2->生产->具体产品2===类型1====");
        return new ConcreteProduct12();
    }

    @Override
    public Product2 newProduct2() {
        LOGGER.info("======工厂2->生产->具体产品2===类型2====");
        return new ConcreteProduct22();
    }
}
