package com.alan.adapter;

import com.alan.adapter.domain.Adaptee;
import com.alan.adapter.domain.ClassAdapter;
import com.alan.adapter.domain.ObjectAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * 在现实生活中，经常出现两个对象因接口不兼容而不能在一起工作的实例，这时需要第三者进行适配。
 * 例如，讲中文的人同讲英文的人对话时需要一个翻译，用直流电的笔记本电脑接交流电源时需要一个电源适配器，
 * 用计算机访问照相机的 SD 内存卡时需要一个读卡器等。
 *
 * 在软件设计中也可能出现：需要开发的具有某种业务功能的组件在现有的组件库中已经存在，
 * 但它们与当前系统的接口规范不兼容，如果重新开发这些组件成本又很高，这时用适配器模式能很好地解决这些问题。
 *
 *
 * 模式的定义与特点
 * 适配器模式（Adapter）的定义如下：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
 * 适配器模式分为类结构型模式和对象结构型模式两种，前者类之间的耦合度比后者高，且要求程序员了解现有组件库中的相关组件的内部结构，所以应用相对较少些。
 *
 * 该模式的主要优点如下。
 * 客户端通过适配器可以透明地调用目标接口。
 * 复用了现存的类，程序员不需要修改原有代码而重用现有的适配者类。
 * 将目标类和适配者类解耦，解决了目标类和适配者类接口不一致的问题。
 *
 * 其缺点是：对类适配器来说，更换适配器的实现过程比较复杂。
 * 模式的结构与实现
 * 类适配器模式可采用多重继承方式实现，如 C++ 可定义一个适配器类来同时继承当前系统的业务接口和现有组件库中已经存在的组件接口；
 * Java 不支持多继承，但可以定义一个适配器类来实现当前系统的业务接口，同时又继承现有组件库中已经存在的组件。
 *
 * 对象适配器模式可釆用将现有组件库中已经实现的组件引入适配器类中，该类同时实现当前系统的业务接口。现在来介绍它们的基本结构。
 *
 * 模式的结构
 * 适配器模式（Adapter）包含以下主要角色。
 * 目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
 * 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
 * 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 *
 *
 * @Description: 适配器模式
 * @Author MengQingHao
 * @Date 2019/11/21 4:36 下午
 * @Version 1.0
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public App() {
        LOGGER.info("类适配器模式测试：");
        new ClassAdapter().request();

        LOGGER.info("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        new ObjectAdapter(adaptee).request();
    }

    public static void main(String[] args) {
        new App();
    }
}
