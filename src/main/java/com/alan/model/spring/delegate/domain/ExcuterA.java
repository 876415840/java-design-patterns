package com.alan.model.spring.delegate.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 普通员工A
 * @Author MengQingHao
 * @Date 2019/11/29 5:26 下午
 * @Version 1.0
 */
public class ExcuterA implements IExcuter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcuterA.class);

    @Override
    public String getName() {
        return "员工A";
    }

    /**
     * 员工A执行某项命令
     * @param command
     */
    @Override
    public void excute(String command) {
        LOGGER.info("员工A 开始做{}的工作", command);
    }
}
