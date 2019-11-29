package com.alan.model.gof23.structure.proxy.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 真实主题
 * @Author MengQingHao
 * @Date 2019/11/8 2:33 下午
 * @Version 1.0
 */
public class RealSubject implements Subject {

    private static final Logger LOGGER = LoggerFactory.getLogger(RealSubject.class);

    @Override
    public void request() {
        LOGGER.info("真实主题请求……");
    }
}
