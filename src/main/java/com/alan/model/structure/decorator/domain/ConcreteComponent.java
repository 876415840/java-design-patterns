package com.alan.model.structure.decorator.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体构件角色
 * @Author MengQingHao
 * @Date 2019/11/21 6:13 下午
 * @Version 1.0
 */
public class ConcreteComponent implements Component {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteComponent.class);

    public ConcreteComponent() {
        LOGGER.info("创建具体构件角色");
    }

    @Override
    public void operation() {
        LOGGER.info("调用具体构件角色的方法operation()");
    }
}
