package com.alan.model.spring.delegate.domain;

/**
 * @Description: 执行 的接口
 * @Author MengQingHao
 * @Date 2019/11/29 5:25 下午
 * @Version 1.0
 */
public interface IExcuter {

    /**
     * 执行
     * @param command
     */
    void excute(String command);

    String getName();
}
