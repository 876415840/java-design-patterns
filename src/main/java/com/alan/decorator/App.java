package com.alan.decorator;

import com.alan.decorator.domain.Component;
import com.alan.decorator.domain.ConcreteComponent;
import com.alan.decorator.domain.ConcreteDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * 在现实生活中，常常需要对现有产品增加新的功能或美化其外观，如房子装修、相片加相框等。
 * 在软件开发过程中，有时想用一些现存的组件。这些组件可能只是完成了一些核心功能。
 * 但在不改变其结构的情况下，可以动态地扩展其功能。所有这些都可以釆用装饰模式来实现。
 *
 * 装饰模式的定义与特点
 * 装饰（Decorator）模式的定义：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。
 *
 * 装饰（Decorator）模式的主要优点有：
 * 采用装饰模式扩展对象的功能比采用继承方式更加灵活。
 * 可以设计出多个不同的具体装饰类，创造出多个不同行为的组合。
 *
 * 其主要缺点是：装饰模式增加了许多子类，如果过度使用会使程序变得很复杂。
 *
 * 装饰模式的结构与实现
 * 通常情况下，扩展一个类的功能会使用继承方式来实现。但继承具有静态特征，耦合度高，并且随着扩展功能的增多，子类会很膨胀。
 * 如果使用组合关系来创建一个包装对象（即装饰对象）来包裹真实对象，并在保持真实对象的类结构不变的前提下，为其提供额外的功能，
 * 这就是装饰模式的目标。下面来分析其基本结构和实现方法。
 *
 * 模式的结构
 * 装饰模式主要包含以下角色。
 * 抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
 * 具体构件（Concrete    Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
 * 抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 * 具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 *
 *
 *
 * @Description: 装饰模式
 * @Author MengQingHao
 * @Date 2019/11/21 6:08 下午
 * @Version 1.0
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public App() {
        Component p=new ConcreteComponent();
        // 只调用元组件
        p.operation();
        LOGGER.info("---------------------------------");
        Component d=new ConcreteDecorator(p);
        // 及调用元组件又调用扩展组件
        d.operation();
    }

    public static void main(String[] args) {
        new App();
    }
}
