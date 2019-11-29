package com.alan.model.spring.delegate;

import com.alan.model.spring.delegate.domain.Leader;

/**
 *
 * 1.委派模式简介
 * 在常用的23种设计模式中其实面没有委派模式（delegate）的影子，但是在Spring中委派模式确实用的比较多的一种模式。
 *
 * 在spring中的体现：Spring MVC框架中的DispatcherServlet其实就用到了委派模式。
 *
 * 委派模式的作用： 基本作用就是负责任务的调用和分配任务，跟代理模式很像，可以看做是一种特殊情况下的静态代理的全权代理，但是代理模式注重过程，而委派模式注重结果
 *
 * 2.委派模式的实例
 * 比如公司boss把任务给leader,而leader做了一个任务的分配和调度的工作，自己没有做工作，而是把具体工作交给具体的执行者去做。
 *
 *
 * @Description: 委派模式
 * @Author MengQingHao
 * @Date 2019/11/29 5:23 下午
 * @Version 1.0
 */
public class App {

    public App() {

        // boss把任务给leader
        Leader leader  = new Leader("登录", "加密");
        //看上去好像是我们的项目经理在干活
        //但实际干活的人是普通员工
        //这就是典型，干活是我的，功劳是你的
        leader.excute("登录");
        leader.excute("加密");
    }

    public static void main(String[] args) {
        new App();
    }
}
