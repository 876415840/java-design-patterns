package com.alan.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @Description document..
 * @Author MengQingHao
 * @Date 2019/10/31 6:53 下午
 * @Version 1.0
 */
public interface Document {
    /**
     * put value
     *
     * @author MengQingHao
     * @param key
     * @param value
     * @date 2019/10/31 6:55 下午
     * @return void
     */
    void put(String key, Object value);

    /**
     * get value
     *
     * @author MengQingHao
     * @param key
     * @date 2019/10/31 6:55 下午
     * @return java.lang.Object
     */
    Object get(String key);

    /**
     * Gets the stream of child documents
     *
     * @author MengQingHao
     * @param key
     * @param constructor
     * @date 2019/10/31 6:56 下午
     * @return java.util.stream.Stream<T>
     */
    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
