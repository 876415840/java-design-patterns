package com.alan.model.behavior.visitor.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体访问者A
 * @Author MengQingHao
 * @Date 2019/11/29 2:21 下午
 * @Version 1.0
 */
public class ConcreteVisitorA implements Visitor {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteVisitorA.class);

    @Override
    public void visit(ConcreteElementA element) {
        LOGGER.info("具体访问者A访问---->{}", element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        LOGGER.info("具体访问者A访问---->{}", element.operationB());
    }
}
