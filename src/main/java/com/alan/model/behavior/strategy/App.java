package com.alan.model.behavior.strategy;

import com.alan.model.behavior.strategy.domain.ConcreteStrategyA;
import com.alan.model.behavior.strategy.domain.ConcreteStrategyB;
import com.alan.model.behavior.strategy.domain.Context;
import com.alan.model.behavior.strategy.domain.Strategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * 在现实生活中常常遇到实现某种目标存在多种策略可供选择的情况，
 * 例如，出行旅游可以乘坐飞机、乘坐火车、骑自行车或自己开私家车等，超市促销可以釆用打折、送商品、送积分等方法。
 *
 * 在软件开发中也常常遇到类似的情况，当实现某一个功能存在多种算法或者策略，
 * 我们可以根据环境或者条件的不同选择不同的算法或者策略来完成该功能，如数据排序策略有冒泡排序、选择排序、插入排序、二叉树排序等。
 *
 * 如果使用多重条件转移语句实现（即硬编码），不但使条件语句变得很复杂，而且增加、删除或更换算法要修改原代码，不易维护，违背开闭原则。
 * 如果采用策略模式就能很好解决该问题。
 *
 * 策略模式的定义与特点
 * 策略（Strategy）模式的定义：该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。
 * 策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。
 *
 * 策略模式的主要优点如下。
 * 多重条件语句不易维护，而使用策略模式可以避免使用多重条件语句。
 * 策略模式提供了一系列的可供重用的算法族，恰当使用继承可以把算法族的公共代码转移到父类里面，从而避免重复的代码。
 * 策略模式可以提供相同行为的不同实现，客户可以根据不同时间或空间要求选择不同的。
 * 策略模式提供了对开闭原则的完美支持，可以在不修改原代码的情况下，灵活增加新算法。
 * 策略模式把算法的使用放到环境类中，而算法的实现移到具体策略类中，实现了二者的分离。
 *
 * 其主要缺点如下。
 * 客户端必须理解所有策略算法的区别，以便适时选择恰当的算法类。
 * 策略模式造成很多的策略类。
 *
 * 策略模式的结构与实现
 * 策略模式是准备一组算法，并将这组算法封装到一系列的策略类里面，作为一个抽象策略类的子类。
 * 策略模式的重心不是如何实现算法，而是如何组织这些算法，从而让程序结构更加灵活，具有更好的维护性和扩展性，现在我们来分析其基本结构和实现方法。
 *
 * 模式的结构
 * 策略模式的主要角色如下。
 * 抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 * 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 *
 * @Description: 策略模式
 * @Author MengQingHao
 * @Date 2019/11/26 11:47 上午
 * @Version 1.0
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public App() {

        Context c=new Context();
        Strategy s=new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        LOGGER.info("---------------------------------------------------");
        s=new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }

    public static void main(String[] args) {
        new App();
    }
}
