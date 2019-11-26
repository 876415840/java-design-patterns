package com.alan.model.structure.flyweight;

import com.alan.model.structure.flyweight.domain.Flyweight;
import com.alan.model.structure.flyweight.domain.FlyweightFactory;
import com.alan.model.structure.flyweight.domain.UnsharedConcreteFlyweight;

/**
 *
 * 在面向对象程序设计过程中，有时会面临要创建大量相同或相似对象实例的问题。创建那么多的对象将会耗费很多的系统资源，它是系统性能提高的一个瓶颈。
 * 例如，围棋和五子棋中的黑白棋子，图像中的坐标点或颜色，局域网中的路由器、交换机和集线器，教室里的桌子和凳子等。
 * 这些对象有很多相似的地方，如果能把它们相同的部分提取出来共享，则能节省大量的系统资源，这就是享元模式的产生背景。
 *
 * 享元模式的定义与特点
 * 享元（Flyweight）模式的定义：运用共享技术来有効地支持大量细粒度对象的复用。
 * 它通过共享已经存在的又橡来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。
 *
 * 享元模式的主要优点是：相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。
 *
 * 其主要缺点是：
 * 为了使对象可以共享，需要将一些不能共享的状态外部化，这将增加程序的复杂性。
 * 读取享元模式的外部状态会使得运行时间稍微变长。
 *
 * 享元模式的结构与实现
 * 享元模式中存在以下两种状态：
 * 内部状态，即不会随着环境的改变而改变的可共享部分；
 * 外部状态，指随环境改变而改变的不可以共享的部分。享元模式的实现要领就是区分应用中的这两种状态，并将外部状态外部化。下面来分析其基本结构和实现方法。
 *
 * 模式的结构
 * 享元模式的主要角色有如下。
 * 抽象享元角色（Flyweight）:是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
 * 具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
 * 非享元（Unsharable Flyweight)角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
 * 享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 *
 * @Description: 享元模式
 * @Author MengQingHao
 * @Date 2019/11/22 6:34 下午
 * @Version 1.0
 */
public class App {

    public App() {
        FlyweightFactory factory=new FlyweightFactory();
        Flyweight f01=factory.getFlyweight("a");
        Flyweight f02=factory.getFlyweight("a");
        Flyweight f03=factory.getFlyweight("a");
        Flyweight f11=factory.getFlyweight("b");
        Flyweight f12=factory.getFlyweight("b");
        f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
        f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
    }

    public static void main(String[] args) {
        new App();
    }
}