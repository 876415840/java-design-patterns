package com.alan.facade.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 子系统1
 * @Author MengQingHao
 * @Date 2019/11/21 7:46 下午
 * @Version 1.0
 */
public class SubSystem01 {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubSystem01.class);

    public  void method1(){
        LOGGER.info("子系统01的method1()被调用！");
    }
}
