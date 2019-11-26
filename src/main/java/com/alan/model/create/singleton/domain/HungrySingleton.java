package com.alan.model.create.singleton.domain;

/**
 * @Description 饿汉式
 * 优点:线程安全
 * 缺点:耗费不必要资源
 *
 * @Author MengQingHao
 * @Date 2019/10/25 4:58 PM
 * @Version 1.0
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
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
