package com.alan.model.create.singleton.domain;

/**
 * @Description 静态块-饿汉
 * 与饿汉式效果一致
 * @Author MengQingHao
 * @Date 2019/10/25 5:03 PM
 * @Version 1.0
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton INSTANCE;

    static {
        INSTANCE = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance() {
        return INSTANCE;
    }

    private Integer i;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }
}
