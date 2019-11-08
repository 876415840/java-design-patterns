package com.alan.singleton.domain;

/**
 * @Description 枚举式单例
 * @Author MengQingHao
 * @Date 2019/10/25 6:03 PM
 * @Version 1.0
 */
public enum EnumSingleton {
    INSTANCE;
    private Integer i;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }
}
