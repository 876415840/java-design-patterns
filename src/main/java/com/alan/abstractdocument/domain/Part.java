package com.alan.abstractdocument.domain;

import com.alan.abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * @Description
 * @Author MengQingHao
 * @Date 2019/10/31 7:09 下午
 * @Version 1.0
 */
public class Part extends AbstractDocument implements HasModel, HasPrice, HasType {

    protected Part(Map<String, Object> properties) {
        super(properties);
    }
}
