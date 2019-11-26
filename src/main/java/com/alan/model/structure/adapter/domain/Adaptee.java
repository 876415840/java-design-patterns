package com.alan.model.structure.adapter.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 适配者
 * @Author MengQingHao
 * @Date 2019/11/21 4:40 下午
 * @Version 1.0
 */
public class Adaptee {

    private static final Logger LOGGER = LoggerFactory.getLogger(Adaptee.class);

    public void specificRequest() {
        LOGGER.info("适配者中的业务代码被调用！");
    }

}
