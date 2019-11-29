package com.alan.model.behavior.iterator.domain;

/**
 * @Description: 抽象聚合
 * @Author MengQingHao
 * @Date 2019/11/27 3:58 下午
 * @Version 1.0
 */
public interface Aggregate {

    /**
     * 添加
     */
    void add(Object object);

    /**
     * 删除
     */
    void remove(Object object);

    /**
     * 获取迭代器
     * @return
     */
    Iterator getIterator();
}
