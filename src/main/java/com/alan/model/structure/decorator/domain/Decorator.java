package com.alan.model.structure.decorator.domain;

/**
 * @Description: 抽象装饰角色
 * @Author MengQingHao
 * @Date 2019/11/21 6:15 下午
 * @Version 1.0
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
