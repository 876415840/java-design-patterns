package com.alan.model.behavior.command;

import com.alan.model.behavior.command.domain.Command;
import com.alan.model.behavior.command.domain.ConcreteCommand;
import com.alan.model.behavior.command.domain.Invoker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * 在软件开发系统中，常常出现“方法的请求者”与“方法的实现者”之间存在紧密的耦合关系。这不利于软件功能的扩展与维护。
 * 例如，想对行为进行“撤销、重做、记录”等处理都很不方便，因此“如何将方法的请求者与方法的实现者解耦？”变得很重要，命令模式能很好地解决这个问题。
 *
 * 在现实生活中，这样的例子也很多，例如，电视机遥控器（命令发送者）通过按钮（具体命令）来遥控电视机（命令接收者），还有计算机键盘上的“功能键”等。
 *
 * 命令模式的定义与特点
 * 命令（Command）模式的定义如下：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。
 * 这样两者之间通过命令对象进行沟通，这样方便将命令对象进行储存、传递、调用、增加与管理。
 *
 * 命令模式的主要优点如下。
 * 降低系统的耦合度。命令模式能将调用操作的对象与实现该操作的对象解耦。
 * 增加或删除命令非常方便。采用命令模式增加与删除命令不会影响其他类，它满足“开闭原则”，对扩展比较灵活。
 * 可以实现宏命令。命令模式可以与组合模式结合，将多个命令装配成一个组合命令，即宏命令。
 * 方便实现 Undo 和 Redo 操作。命令模式可以与后面介绍的备忘录模式结合，实现命令的撤销与恢复。
 *
 * 其缺点是：可能产生大量具体命令类。因为计对每一个具体操作都需要设计一个具体命令类，这将增加系统的复杂性。
 *
 * 命令模式的结构与实现
 * 可以将系统中的相关操作抽象成命令，使调用者与实现者相关分离，其结构如下。
 *
 * 模式的结构
 * 命令模式包含以下主要角色。
 * 抽象命令类（Command）角色：声明执行命令的接口，拥有执行命令的抽象方法 execute()。
 * 具体命令角色（Concrete    Command）角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
 * 实现者/接收者（Receiver）角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者。
 * 调用者/请求者（Invoker）角色：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者。
 *
 * @Description: 命令模式
 * @Author MengQingHao
 * @Date 2019/11/26 12:03 下午
 * @Version 1.0
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public App() {

        Command cmd=new ConcreteCommand();
        Invoker ir=new Invoker(cmd);
        LOGGER.info("客户访问调用者的call()方法...");
        ir.call();
    }

    public static void main(String[] args) {
        new App();
    }
}
