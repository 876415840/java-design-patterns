package com.alan.model.behavior.strategy.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体策略B
 * @Author MengQingHao
 * @Date 2019/11/26 11:53 上午
 * @Version 1.0
 */
public class ConcreteStrategyB implements Strategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteStrategyB.class);

    @Override
    public void strategyMethod() {
        LOGGER.info("具体策略B的策略方法被调用");
    }
}
