package com.alan.singleton.domain;

/**
 * @Description 懒汉式-内部类实现
 * 优点:既优雅又解决了线程安全问题(内部类延时加载)
 * 缺点:通过反射调用构造方法会破坏单例模式(之前的两种饿汉式和两种懒汉式都存在此问题)
 *
 * @Author MengQingHao
 * @Date 2019/10/25 5:40 PM
 * @Version 1.0
 */
public class LazyStaticInnerSingleton {

    private LazyStaticInnerSingleton(){
    }

    public static final LazyStaticInnerSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static final class LazyHolder{
        public static final LazyStaticInnerSingleton INSTANCE = new LazyStaticInnerSingleton();
    }

    private Integer i;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }
}
