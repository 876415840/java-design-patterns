package com.alan.model.behavior.mediator.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 具体中介者
 * @Author MengQingHao
 * @Date 2019/11/26 5:10 下午
 * @Version 1.0
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues=new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague colleague : colleagues) {
            if (!colleague.equals(cl)) {
                colleague.receive();
            }
        }
    }
}
