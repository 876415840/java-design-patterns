package com.alan.model.gof23.behavior.strategy.domain;

/**
 * @Description: 环境类
 * @Author MengQingHao
 * @Date 2019/11/26 11:54 上午
 * @Version 1.0
 */
public class Context {

    public void strategyMethod() {
        strategy.strategyMethod();
    }

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
