package com.alan.model.create.singleton.domain;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description 容器式单例
 * spring中的做法，就只这种注册式单例
 *
 * @Author MengQingHao
 * @Date 2019/10/25 6:31 PM
 * @Version 1.0
 */
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    Class<?> clazz = Class.forName(className);
                    Constructor<?> c = clazz.getDeclaredConstructor();
                    c.setAccessible(true);
                    obj = c.newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
            return ioc.get(className);
        }
    }

}
