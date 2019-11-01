package com.alan.abstractdocument.domain;

import com.alan.abstractdocument.Document;

import java.util.Optional;

/**
 * @Description
 * @Author MengQingHao
 * @Date 2019/10/31 7:08 下午
 * @Version 1.0
 */
public interface HasPrice extends Document {

    String PROPERTY = "price";

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(PROPERTY));
    }
}
