package com.alan.model.gof23.behavior.strategy.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体策略A
 * @Author MengQingHao
 * @Date 2019/11/26 11:53 上午
 * @Version 1.0
 */
public class ConcreteStrategyA implements Strategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteStrategyA.class);

    @Override
    public void strategyMethod() {
        LOGGER.info("具体策略A的策略方法被调用");
    }
}
