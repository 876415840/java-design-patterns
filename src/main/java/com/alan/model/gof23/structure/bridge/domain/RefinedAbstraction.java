package com.alan.model.gof23.structure.bridge.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 扩展抽象化角色
 * @Author MengQingHao
 * @Date 2019/11/21 5:34 下午
 * @Version 1.0
 */
public class RefinedAbstraction extends Abstraction {

    private static final Logger LOGGER = LoggerFactory.getLogger(RefinedAbstraction.class);

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        LOGGER.info("扩展抽象化(Refined Abstraction)角色被访问" );
        implementor.operationImpl();
    }
}
