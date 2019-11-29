package com.alan.model.gof23.behavior.interpreter.case1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 环境类
 * @Author MengQingHao
 * @Date 2019/11/29 5:03 下午
 * @Version 1.0
 */
public class Context {

    private static final Logger LOGGER = LoggerFactory.getLogger(Context.class);

    private String[] citys = {"韶关","广州"};
    private String[] persons = {"老人","妇女","儿童"};
    private Expression cityPerson;
    public Context() {
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        cityPerson= new AndExpression(city, person);
    }
    public void freeRide(String info) {
        boolean ok = cityPerson.interpret(info);
        if(ok) {
            LOGGER.info("您是{}，您本次乘车免费！", info);
        } else {
            LOGGER.info("{}，您不是免费人员，本次乘车扣费2元！", info);
        }
    }
}
