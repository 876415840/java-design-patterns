package com.alan.model.gof23.behavior.template.method.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体子类
 * @Author MengQingHao
 * @Date 2019/11/26 11:43 上午
 * @Version 1.0
 */
public class ConcreteClass extends AbstractClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteClass.class);

    @Override
    public void abstractMethod1() {
        LOGGER.info("抽象方法1被实现调用");
    }

    @Override
    public void abstractMethod2() {
        LOGGER.info("抽象方法2被实现调用");
    }
}
