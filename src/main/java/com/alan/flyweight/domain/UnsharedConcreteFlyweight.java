package com.alan.flyweight.domain;

/**
 * @Description: 非享元角色
 * @Author MengQingHao
 * @Date 2019/11/22 6:37 下午
 * @Version 1.0
 */
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
