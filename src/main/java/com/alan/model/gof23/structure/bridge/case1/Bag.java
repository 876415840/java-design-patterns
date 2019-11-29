package com.alan.model.gof23.structure.bridge.case1;

/**
 * @Description: 抽象化角色：包
 * @Author MengQingHao
 * @Date 2019/11/21 5:57 下午
 * @Version 1.0
 */
public abstract class Bag {

    protected Color color;

    public Bag(Color color) {
        this.color = color;
    }

    /**
     * 名字
     * @return
     */
    public abstract String getName();
}
