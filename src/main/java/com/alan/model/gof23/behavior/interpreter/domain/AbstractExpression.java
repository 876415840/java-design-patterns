package com.alan.model.gof23.behavior.interpreter.domain;

/**
 * @Description: 抽象表达式类
 * @Author MengQingHao
 * @Date 2019/11/29 4:53 下午
 * @Version 1.0
 */
public interface AbstractExpression {

    /**
     * 解释方法
     * @param info
     * @return
     */
    Object interpret(String info);
}
