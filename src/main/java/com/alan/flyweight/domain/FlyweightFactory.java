package com.alan.flyweight.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @Description: 享元工厂角色
 * @Author MengQingHao
 * @Date 2019/11/22 6:43 下午
 * @Version 1.0
 */
public class FlyweightFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlyweightFactory.class);

    private HashMap<String, Flyweight> flyweights=new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight == null) {
            LOGGER.info("具体享元-{}-不存在，新创建", key);
            flyweight=new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
