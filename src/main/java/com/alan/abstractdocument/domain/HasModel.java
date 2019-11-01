package com.alan.abstractdocument.domain;

import com.alan.abstractdocument.Document;

import java.util.Optional;

/**
 * @Description
 * @Author MengQingHao
 * @Date 2019/10/31 7:05 下午
 * @Version 1.0
 */
public interface HasModel extends Document {

    String PROPERTY = "model";

    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
