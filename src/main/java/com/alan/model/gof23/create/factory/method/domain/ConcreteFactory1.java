package com.alan.model.gof23.create.factory.method.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 具体工厂1
 * @Author MengQingHao
 * @Date 2019/11/6 12:04 下午
 * @Version 1.0
 */
public class ConcreteFactory1 implements AbstractFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteFactory1.class);

    @Override
    public Product newProduct() {
        LOGGER.info("======工厂1->生产产品1=======");
        return new ConcreteProduct1();
    }
}
