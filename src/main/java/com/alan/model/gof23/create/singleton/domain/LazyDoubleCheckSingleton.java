package com.alan.model.gof23.create.singleton.domain;

/**
 * @Description 懒汉式-双重检查
 * 优点:解决线程并发问题，且最优性能
 * 缺点:可读性差，不优雅
 *
 * @Author MengQingHao
 * @Date 2019/10/25 5:26 PM
 * @Version 1.0
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance() {
        // 并发情况下，之前线程已经创建了对象，之后线程就会被拦截不走同步方法，提升性能
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                // 并发情况下，初始并发下判断不重复创建
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                    // CPU指令重排序的问题 -- volatile关键字解决
                }
            }
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
