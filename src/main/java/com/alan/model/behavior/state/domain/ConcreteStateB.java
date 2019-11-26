package com.alan.model.behavior.state.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体状态B类
 * @Author MengQingHao
 * @Date 2019/11/26 2:25 下午
 * @Version 1.0
 */
public class ConcreteStateB extends State {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteStateB.class);

    @Override
    public void handle(Context context) {
        LOGGER.info("当前状态是 B 。");
        context.setState(new ConcreteStateA());
    }
}
