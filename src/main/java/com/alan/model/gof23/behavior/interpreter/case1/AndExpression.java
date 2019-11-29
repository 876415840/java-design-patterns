package com.alan.model.gof23.behavior.interpreter.case1;

/**
 * @Description: 非终结符表达式
 * @Author MengQingHao
 * @Date 2019/11/29 5:02 下午
 * @Version 1.0
 */
public class AndExpression implements Expression {

    private Expression city=null;
    private Expression person=null;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String s[]=info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
