package com.alan.model.gof23.structure.flyweight.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体享元角色
 * @Author MengQingHao
 * @Date 2019/11/22 6:40 下午
 * @Version 1.0
 */
public class ConcreteFlyweight implements Flyweight {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteFlyweight.class);

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        LOGGER.info("具体享元-{}-被创建", key);
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        LOGGER.info("具体享元-{}-操作方法被调用,info:{}", key, state.getInfo());
    }
}
