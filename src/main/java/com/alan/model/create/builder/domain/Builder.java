package com.alan.model.create.builder.domain;

/**
 * @Description: 抽象建造者：包含创建产品各个子部件的抽象方法。
 * @Author MengQingHao
 * @Date 2019/11/8 12:01 下午
 * @Version 1.0
 */
public abstract class Builder {
    /**
     * 创建产品对象
     */
    protected Product product=new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    /**
     * @Description: 获取产品对象
     * @return com.alan.model.construction.builder.domain.Product
     * @author MengQingHao
     * @date 2019/11/8 12:05 下午
     * @version 1.0
     */
    public Product getResult() {
        return product;
    }
}
