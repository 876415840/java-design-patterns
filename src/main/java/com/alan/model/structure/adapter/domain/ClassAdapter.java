package com.alan.model.structure.adapter.domain;

/**
 * @Description: 类适配器
 * @Author MengQingHao
 * @Date 2019/11/21 4:42 下午
 * @Version 1.0
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
