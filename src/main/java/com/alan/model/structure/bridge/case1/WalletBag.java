package com.alan.model.structure.bridge.case1;

/**
 * @Description: 扩展抽象化角色：钱包
 * @Author MengQingHao
 * @Date 2019/11/21 6:00 下午
 * @Version 1.0
 */
public class WalletBag extends Bag {

    public WalletBag(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor()+"-Wallet";
    }
}
