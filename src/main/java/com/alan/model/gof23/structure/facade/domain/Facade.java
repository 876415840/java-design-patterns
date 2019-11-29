package com.alan.model.gof23.structure.facade.domain;

/**
 * @Description: 外观角色
 * @Author MengQingHao
 * @Date 2019/11/21 7:46 下午
 * @Version 1.0
 */
public class Facade {

    private SubSystem01 obj1=new SubSystem01();
    private SubSystem02 obj2=new SubSystem02();
    private SubSystem03 obj3=new SubSystem03();
    public void method()
    {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
