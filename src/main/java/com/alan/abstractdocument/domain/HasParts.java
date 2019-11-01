package com.alan.abstractdocument.domain;

import com.alan.abstractdocument.Document;

import java.util.stream.Stream;

/**
 * @Description
 * @Author MengQingHao
 * @Date 2019/10/31 7:06 下午
 * @Version 1.0
 */
public interface HasParts extends Document {

    String PROPERTY = "parts";

    default Stream<Part> getParts() {
        return children(PROPERTY, Part::new);
    }
}
