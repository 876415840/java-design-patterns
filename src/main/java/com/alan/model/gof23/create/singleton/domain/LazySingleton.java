package com.alan.model.gof23.create.singleton.domain;


/**
 * @Description 懒汉式
 * 优点:解决了'饿汉式'的资源浪费问题
 * 缺点:线程不安全
 *
 * 方法加synchronized 不可取
 *
 * @Author MengQingHao
 * @Date 2019/10/25 5:07 PM
 * @Version 1.0
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    private Integer i;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }
}
