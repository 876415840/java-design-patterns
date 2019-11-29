package com.alan.model.behavior.iterator.domain;

/**
 * @Description: 抽象迭代器
 * @Author MengQingHao
 * @Date 2019/11/27 4:03 下午
 * @Version 1.0
 */
public interface Iterator {

    /**
     * 列表首个对象
     * @return
     */
    Object first();

    /**
     * 列表下个对象
     * @return
     */
    Object next();

    /**
     * 是否存在下个对象
     * @return
     */
    boolean hasNext();
}
