package com.alan.model.spring.delegate.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: leader 委派者
 * @Author MengQingHao
 * @Date 2019/11/29 5:26 下午
 * @Version 1.0
 */
public class Leader implements IExcuter {

    private static final Logger LOGGER = LoggerFactory.getLogger(Leader.class);

    private Map<String,IExcuter> targets = new HashMap<String,IExcuter>();

    public Leader(String command1, String command2) {
        targets.put(command1, new ExcuterA());
        targets.put(command2, new ExcuterB());
    }

    /**
     * 任务分发
     * @param command
     */
    @Override
    public void excute(String command) {
        LOGGER.info("领导 开始分配{}的工作", command);
        IExcuter iExcuter = targets.get(command);
        LOGGER.info("领导 将{}的工作分配给{}", command, iExcuter.getName());
        iExcuter.excute(command);
    }

    @Override
    public String getName() {
        return "领导";
    }
}
