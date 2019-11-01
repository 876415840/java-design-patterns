package com.alan.abstractdocument.domain;

import com.alan.abstractdocument.Document;

import java.util.Optional;

/**
 * @Description
 * @Author MengQingHao
 * @Date 2019/10/31 7:09 下午
 * @Version 1.0
 */
public interface HasType extends Document {

    String PROPERTY = "type";

    default Optional<String> getType() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
