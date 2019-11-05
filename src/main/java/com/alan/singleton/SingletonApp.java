package com.alan.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 单例模式
 * @Author MengQingHao
 * @Date 2019/11/1 5:07 下午
 * @Version 1.0
 */
public class SingletonApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(SingletonApp.class);

    public SingletonApp() {
        HungrySingleton.getInstance().setI(1);
        LOGGER.info("-------->{}", HungrySingleton.getInstance().getI());
        HungryStaticSingleton.getInstance().setI(2);
        LOGGER.info("-------->{}", HungryStaticSingleton.getInstance().getI());
        LazySingleton.getInstance().setI(3);
        LOGGER.info("-------->{}", LazySingleton.getInstance().getI());
        LazyDoubleCheckSingleton.getInstance().setI(4);
        LOGGER.info("-------->{}", LazyDoubleCheckSingleton.getInstance().getI());
        LazyStaticInnerSingleton.getInstance().setI(5);
        LOGGER.info("-------->{}", LazyStaticInnerSingleton.getInstance().getI());
        EnumSingleton.INSTANCE.setI(6);
        LOGGER.info("-------->{}", EnumSingleton.INSTANCE.getI());
        String className = "com.alan.singleton.TestObj";
        ((TestObj) ContainerSingleton.getInstance(className)).setI(7);
        LOGGER.info("-------->{}", ((TestObj) ContainerSingleton.getInstance(className)).getI());
    }

    public static void main(String[] args) {
        new SingletonApp();
    }
}
