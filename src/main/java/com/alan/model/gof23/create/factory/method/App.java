package com.alan.model.gof23.create.factory.method;

import com.alan.model.gof23.create.factory.method.domain.AbstractFactory;
import com.alan.model.gof23.create.factory.method.domain.Product;

/**
 * 模式的定义与特点
 * 工厂方法（FactoryMethod）模式的定义：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。
 * 这满足创建型模式中所要求的“创建与使用相分离”的特点。
 *
 * 我们把被创建的对象称为“产品”，把创建产品的对象称为“工厂”。如果要创建的产品不多，只要一个工厂类就可以完成，这种模式叫“简单工厂模式”，
 * 它不属于 GoF 的 23 种经典设计模式，它的缺点是增加新产品时会违背“开闭原则”。
 *
 * 本节介绍的“工厂方法模式”是对简单工厂模式的进一步抽象化，其好处是可以使系统在不修改原来代码的情况下引进新的产品，即满足开闭原则。
 *
 * 工厂方法模式的主要优点有：
 * 用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
 * 在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则；
 *
 * 其缺点是：每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。
 * 模式的结构与实现
 * 工厂方法模式由抽象工厂、具体工厂、抽象产品和具体产品等4个要素构成。本节来分析其基本结构和实现方法。
 *
 * 模式的结构
 * 工厂方法模式的主要角色如下。
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
 * 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
 * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
 *
 *
 * @Description 工厂方法模式
 * @Author MengQingHao
 * @Date 2019/11/6 12:00 下午
 * @Version 1.0
 */
public class App {

    public App() {
        String[] classNames = new String[]{"com.alan.model.construction.factory.method.domain.ConcreteFactory1", "com.alan.model.construction.factory.method.domain.ConcreteFactory2"};
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
            Product product = abstractFactory.newProduct();
            product.show();
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
