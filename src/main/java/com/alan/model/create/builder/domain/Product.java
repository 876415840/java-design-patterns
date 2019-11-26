package com.alan.model.create.builder.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 产品角色：包含多个组成部件的复杂对象。
 * @Author MengQingHao
 * @Date 2019/11/8 11:58 上午
 * @Version 1.0
 */
public class Product {

    private static final Logger LOGGER = LoggerFactory.getLogger(Product.class);

    private String partA;
    private String partB;
    private String partC;
    public void setPartA(String partA)
    {
        this.partA=partA;
    }
    public void setPartB(String partB)
    {
        this.partB=partB;
    }
    public void setPartC(String partC)
    {
        this.partC=partC;
    }
    public void show() {
        //显示产品的特性
        LOGGER.info("产品特性 => partA:{} partB:{} partC:{}", partA, partB, partC);
    }
}
