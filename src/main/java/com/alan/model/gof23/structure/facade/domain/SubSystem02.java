package com.alan.model.gof23.structure.facade.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 子系统2
 * @Author MengQingHao
 * @Date 2019/11/21 7:46 下午
 * @Version 1.0
 */
public class SubSystem02 {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubSystem02.class);

    public  void method2(){
        LOGGER.info("子系统02的method2()被调用！");
    }
}
