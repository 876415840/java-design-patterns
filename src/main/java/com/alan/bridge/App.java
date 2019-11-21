package com.alan.bridge;

import com.alan.bridge.case1.*;
import com.alan.bridge.domain.Abstraction;
import com.alan.bridge.domain.ConcreteImplementorA;
import com.alan.bridge.domain.Implementor;
import com.alan.bridge.domain.RefinedAbstraction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * 在现实生活中，某些类具有两个或多个维度的变化，如图形既可按形状分，又可按颜色分。
 * 如何设计类似于 Photoshop 这样的软件，能画不同形状和不同颜色的图形呢？
 * 如果用继承方式，m 种形状和 n 种颜色的图形就有 m×n 种，不但对应的子类很多，而且扩展困难。
 *
 * 当然，这样的例子还有很多，如不同颜色和字体的文字、不同品牌和功率的汽车、不同性别和职业的男女、支持不同平台和不同文件格式的媒体播放器等。
 * 如果用桥接模式就能很好地解决这些问题。
 * 桥接模式的定义与特点
 * 桥接（Bridge）模式的定义如下：将抽象与实现分离，使它们可以独立变化。
 * 它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 *
 * 桥接（Bridge）模式的优点是：
 * 由于抽象与实现分离，所以扩展能力强；
 * 其实现细节对客户透明。
 *
 * 缺点是：由于聚合关系建立在抽象层，要求开发者针对抽象化进行设计与编程，这增加了系统的理解与设计难度。
 * 桥接模式的结构与实现
 * 可以将抽象化部分与实现化部分分开，取消二者的继承关系，改用组合关系。
 *
 * 模式的结构
 * 桥接（Bridge）模式包含以下主要角色。
 * 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 * 扩展抽象化（Refined    Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 * 实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
 * 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。
 *
 *
 * @Description: 桥接模式
 * @Author MengQingHao
 * @Date 2019/11/21 5:23 下午
 * @Version 1.0
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public App() {

        Implementor imple=new ConcreteImplementorA();
        Abstraction abs=new RefinedAbstraction(imple);
        abs.operation();
        LOGGER.info("----------------------------------------------------");

        Color color = new Yellow();
        Bag bag = new WalletBag(color);
        LOGGER.info("---------->{}", bag.getName());
        color = new Yellow();
        bag = new HandBag(color);
        LOGGER.info("---------->{}", bag.getName());
        color = new Red();
        bag = new WalletBag(color);
        LOGGER.info("---------->{}", bag.getName());
        color = new Red();
        bag = new HandBag(color);
        LOGGER.info("---------->{}", bag.getName());
    }

    public static void main(String[] args) {
        new App();
    }
}
