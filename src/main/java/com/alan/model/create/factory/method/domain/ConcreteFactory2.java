package com.alan.model.create.factory.method.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 具体工厂2
 * @Author MengQingHao
 * @Date 2019/11/6 12:08 下午
 * @Version 1.0
 */
public class ConcreteFactory2 implements AbstractFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteFactory2.class);

    @Override
    public Product newProduct() {
        LOGGER.info("======工厂2->生产产品2=======");
        return new ConcreteProduct2();
    }
}
