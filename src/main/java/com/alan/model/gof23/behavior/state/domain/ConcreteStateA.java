package com.alan.model.gof23.behavior.state.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体状态A类
 * @Author MengQingHao
 * @Date 2019/11/26 2:25 下午
 * @Version 1.0
 */
public class ConcreteStateA extends State {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteStateA.class);
    
    @Override
    public void handle(Context context) {
        LOGGER.info("当前状态是 A 。");
        context.setState(new ConcreteStateB());
    }
}
