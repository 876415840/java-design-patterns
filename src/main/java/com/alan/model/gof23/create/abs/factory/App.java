package com.alan.model.gof23.create.abs.factory;


import com.alan.model.gof23.create.abs.factory.domain.AbstractFactory;
import com.alan.model.gof23.create.abs.factory.domain.Product1;
import com.alan.model.gof23.create.abs.factory.domain.Product2;

/**
 *
 * 抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。
 *
 * 使用抽象工厂模式一般要满足以下条件。
 * 系统中有多个产品族，每个具体工厂创建同一族但属于不同等级结构的产品。
 * 系统一次只可能消费其中某一族产品，即同族的产品一起使用。
 *
 * 抽象工厂模式除了具有工厂方法模式的优点外，其他主要优点如下。
 * 可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理。
 * 当增加一个新的产品族时不需要修改原代码，满足开闭原则。
 *
 * 其缺点是：当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。
 * 模式的结构与实现
 * 抽象工厂模式同工厂方法模式一样，也是由抽象工厂、具体工厂、抽象产品和具体产品等 4 个要素构成，
 * 但抽象工厂中方法个数不同，抽象产品的个数也不同。现在我们来分析其基本结构和实现方法。
 *
 * 模式的结构
 * 抽象工厂模式的主要角色如下。
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。
 * 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
 * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它 同具体工厂之间是多对一的关系。
 *
 *
 * @Description: 抽象工厂模式
 * @Author MengQingHao
 * @Date 2019/11/7 3:31 下午
 * @Version 1.0
 */
public class App {

    /**
     * 抽象工厂模式
     * -- 适用于兼容场景，兼容多个业务类的相同功能方法
     *
     * 定义一个接口及n个方法
     * 不同的业务类创建不同的实现，方法内调用业务类方法
     * 新的接口及实现类兼容原不同的业务类
     *
     */
    public App(){
        String[] classNames = new String[]{"com.alan.model.construction.abs.factory.domain.ConcreteFactory1", "com.alan.model.construction.abs.factory.domain.ConcreteFactory2"};
        for (String className : classNames) {
            Class<?> clazz;
            try {
                clazz = Class.forName(className);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                continue;
            }
            AbstractFactory abstractFactory;
            try {
                abstractFactory = (AbstractFactory) clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
            Product1 product1 = abstractFactory.newProduct1();
            product1.show();
            Product2 product2 = abstractFactory.newProduct2();
            product2.show();
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
