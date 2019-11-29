package com.alan.model.gof23.behavior.interpreter.domain;

/**
 * @Description: 非终结符表达式类
 * @Author MengQingHao
 * @Date 2019/11/29 4:55 下午
 * @Version 1.0
 */
public class NonterminalExpression implements AbstractExpression {

    private AbstractExpression exp1;
    private AbstractExpression exp2;

    @Override
    public Object interpret(String info) {
        // 非对终结符表达式的处理
        return null;
    }
}
