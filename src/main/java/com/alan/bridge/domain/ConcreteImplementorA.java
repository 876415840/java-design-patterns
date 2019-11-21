package com.alan.bridge.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体实现化角色
 * @Author MengQingHao
 * @Date 2019/11/21 5:26 下午
 * @Version 1.0
 */
public class ConcreteImplementorA implements Implementor {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteImplementorA.class);

    @Override
    public void operationImpl() {
        LOGGER.info("具体实现化(Concrete Implementor)角色被访问");
    }
}
