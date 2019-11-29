package com.alan.model.gof23.behavior.interpreter.domain;

/**
 * @Description: 环境类
 * @Author MengQingHao
 * @Date 2019/11/29 4:57 下午
 * @Version 1.0
 */
public class Context {

    private AbstractExpression abstractExpression;

    public Context() {
        // 数据初始化
    }

    public void operation(String info) {
        // 调用相关表达式类的解释方法
    }
}
