package com.alan.model.behavior.command.domain;

/**
 * @Description: 具体命令
 * @Author MengQingHao
 * @Date 2019/11/26 12:08 下午
 * @Version 1.0
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
