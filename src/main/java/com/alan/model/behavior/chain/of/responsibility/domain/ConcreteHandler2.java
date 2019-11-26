package com.alan.model.behavior.chain.of.responsibility.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * @Description: 具体处理者角色2
 * @Author MengQingHao
 * @Date 2019/11/26 12:23 下午
 * @Version 1.0
 */
public class ConcreteHandler2 extends Handler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteHandler2.class);

    @Override
    public void handleRequest(String request) {

        if (Objects.equals(request, "two")) {
            LOGGER.info("具体处理者2处理当前请求。。。");
            return;
        }

        if (getNext() == null) {
            LOGGER.info("没有人可以处理当前请求。。。");
            return;
        }

        getNext().handleRequest(request);

    }
}
