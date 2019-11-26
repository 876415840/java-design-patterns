package com.alan.model.create.factory.method.domain;

/**
 * @Description 抽象工厂
 * @Author MengQingHao
 * @Date 2019/11/6 12:00 下午
 * @Version 1.0
 */
public interface AbstractFactory {

    /**
     * 生产新产品
     *
     * @author MengQingHao
     * @param
     * @date 2019/11/6 12:02 下午
     * @return com.alan.factory_method.domain.Product
     */
    Product newProduct();
}
