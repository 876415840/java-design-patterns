package com.alan.model.gof23.structure.decorator.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体装饰角色
 * @Author MengQingHao
 * @Date 2019/11/21 6:17 下午
 * @Version 1.0
 */
public class ConcreteDecorator extends Decorator {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteDecorator.class);

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    /**
     * 扩展组件方法
     */
    public void addedFunction() {
        LOGGER.info("为具体构件角色增加额外的功能addedFunction()");
    }
}
