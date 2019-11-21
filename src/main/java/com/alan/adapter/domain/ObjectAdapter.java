package com.alan.adapter.domain;

/**
 * @Description: 对象适配器
 * @Author MengQingHao
 * @Date 2019/11/21 4:47 下午
 * @Version 1.0
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee)
    {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
