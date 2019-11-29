package com.alan.model.gof23.behavior.interpreter.case1;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 终结符表达式
 * @Author MengQingHao
 * @Date 2019/11/29 5:00 下午
 * @Version 1.0
 */
public class TerminalExpression implements Expression {

    private Set<String> set= new HashSet<String>();

    public TerminalExpression(String[] data) {
        for(int i=0; i<data.length; i++) {
            set.add(data[i]);
        }
    }

    @Override
    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}
