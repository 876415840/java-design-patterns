package com.alan.model.create.builder.domain;

/**
 * @Description: 指挥者：调用建造者中的方法完成复杂对象的创建。
 * @Author MengQingHao
 * @Date 2019/11/8 12:06 下午
 * @Version 1.0
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder=builder;
    }
    /**
     * @Description: 产品构建与组装方法
     * @return com.alan.model.construction.builder.domain.Product
     * @author MengQingHao
     * @date 2019/11/8 12:07 下午
     * @version 1.0
     */
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
