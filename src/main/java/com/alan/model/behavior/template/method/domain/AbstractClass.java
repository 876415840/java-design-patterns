package com.alan.model.behavior.template.method.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 抽象类
 * @Author MengQingHao
 * @Date 2019/11/26 11:41 上午
 * @Version 1.0
 */
public abstract class AbstractClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractClass.class);

    /**
     * 模板方法
     */
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    /**
     * 具体方法
     */
    public void SpecificMethod() {
        LOGGER.info("抽象类中的具体方法被调用...");
    }

    /**
     * 抽象方法1
     */
    public abstract void abstractMethod1();

    /**
     * 抽象方法2
     */
    public abstract void abstractMethod2();
}
