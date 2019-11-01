package com.alan.abstractdocument.domain;

import com.alan.abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * @Description
 * @Author MengQingHao
 * @Date 2019/10/31 7:11 下午
 * @Version 1.0
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {
    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
