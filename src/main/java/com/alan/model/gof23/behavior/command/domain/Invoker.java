package com.alan.model.gof23.behavior.command.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 调用者
 * @Author MengQingHao
 * @Date 2019/11/26 12:11 下午
 * @Version 1.0
 */
public class Invoker {

    private static final Logger LOGGER = LoggerFactory.getLogger(Invoker.class);

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        LOGGER.info("调用者执行command命令。。。。");
        command.execute();
    }
}
