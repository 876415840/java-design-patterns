package com.alan.model.create.singleton;

import com.alan.model.create.singleton.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * 单例模式的定义与特点
 * 单例（Singleton）模式的定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。
 * 例如，Windows 中只能打开一个任务管理器，这样可以避免因打开多个任务管理器窗口而造成内存资源的浪费，
 * 或出现各个窗口显示内容的不一致等错误。
 *
 * 在计算机系统中，还有 Windows 的回收站、操作系统中的文件系统、多线程中的线程池、显卡的驱动程序对象、
 * 打印机的后台处理服务、应用程序的日志对象、数据库的连接池、网站的计数器、Web 应用的配置对象、
 * 应用程序中的对话框、系统中的缓存等常常被设计成单例。
 *
 * 单例模式有 3 个特点：
 * 单例类只有一个实例对象；
 * 该单例对象必须由单例类自行创建；
 * 单例类对外提供一个访问该单例的全局访问点；
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 应用场景：全局单个实例，多点操作同一个对象
 * 优缺点：详见各类实现描述
 *
 * @Description 单例模式
 * @Author MengQingHao
 * @Date 2019/11/1 5:07 下午
 * @Version 1.0
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public App() {
        HungrySingleton.getInstance().setI(1);
        LOGGER.info("-------->{}", HungrySingleton.getInstance().getI());
        HungryStaticSingleton.getInstance().setI(2);
        LOGGER.info("-------->{}", HungryStaticSingleton.getInstance().getI());
        LazySingleton.getInstance().setI(3);
        LOGGER.info("-------->{}", LazySingleton.getInstance().getI());
        LazyDoubleCheckSingleton.getInstance().setI(4);
        LOGGER.info("-------->{}", LazyDoubleCheckSingleton.getInstance().getI());
        LazyStaticInnerSingleton.getInstance().setI(5);
        LOGGER.info("-------->{}", LazyStaticInnerSingleton.getInstance().getI());
        EnumSingleton.INSTANCE.setI(6);
        LOGGER.info("-------->{}", EnumSingleton.INSTANCE.getI());
        String className = "com.alan.model.construction.singleton.domain.TestObj";
        ((TestObj) ContainerSingleton.getInstance(className)).setI(7);
        LOGGER.info("-------->{}", ((TestObj) ContainerSingleton.getInstance(className)).getI());
    }

    public static void main(String[] args) {
        new App();
    }
}
