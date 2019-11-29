package com.alan.model.gof23.structure.bridge.case1;

/**
 * @Description: 扩展抽象化角色：挎包
 * @Author MengQingHao
 * @Date 2019/11/21 5:59 下午
 * @Version 1.0
 */
public class HandBag extends Bag {

    public HandBag(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor()+"-HandBag";
    }
}
