package com.alan.model.gof23.create.abs.factory.domain;


/**
 * @Description: 抽象工厂
 * @Author MengQingHao
 * @Date 2019/11/7 3:32 下午
 * @Version 1.0
 */
public interface AbstractFactory {

    /**
     * @Description: 生产类型1商品
     * @return com.alan.model.construction.abs.factory.domain.Product1
     * @author MengQingHao
     * @date 2019/11/7 3:34 下午
     * @version 1.0        
     */
    Product1 newProduct1();
    
    /**
     * @Description: 生产类型2商品
     * @return com.alan.model.construction.abs.factory.domain.Product2
     * @author MengQingHao
     * @date 2019/11/7 3:35 下午
     * @version 1.0        
     */
    Product2 newProduct2();
}
