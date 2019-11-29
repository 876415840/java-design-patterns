package com.alan.model.gof23.create.prototype;

import com.alan.model.gof23.create.prototype.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 原型模式的定义与特点
 * 原型（Prototype）模式的定义如下：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
 * 在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无须知道对象创建的细节。
 *
 * 例如，Windows 操作系统的安装通常较耗时，如果复制就快了很多。在生活中复制的例子非常多，这里不一一列举了。
 *
 * 原型模式的结构与实现
 * 由于 Java 提供了对象的 clone() 方法，所以用 Java 实现原型模式很简单。
 *
 * 模式的结构
 * 原型模式包含以下主要角色。
 * 抽象原型类：规定了具体原型对象必须实现的接口。
 * 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 * 访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 *
 * @Description 原型模式
 * @Author MengQingHao
 * @Date 2019/11/6 11:11 上午
 * @Version 1.0
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public App () throws CloneNotSupportedException {
        Student s1 = new Student("张三", "男", 14, "北京", "8年级");
        Student s2 = (Student) s1.clone();
        s2.setName("李四");
        s2.setRegion("天津");
        Student s3 = (Student) s1.clone();
        s3.setName("小红");
        s3.setGender("女");
        s3.setAge(15);
        s3.setClasses("9年级");
        Student s4 = (Student) s1.clone();
        s4.setName("小黑");
        s4.setAge(15);
        s4.setClasses("9年级");
        Student s5 = (Student) s1.clone();
        s5.setName("小白");
        s5.setGender("女");

        LOGGER.info("---------------->{}", s1.toString());
        LOGGER.info("---------------->{}", s2.toString());
        LOGGER.info("---------------->{}", s3.toString());
        LOGGER.info("---------------->{}", s4.toString());
        LOGGER.info("---------------->{}", s5.toString());
    }

    public static void main(String[] args) {
        try {
            new App();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
