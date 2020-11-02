package com.alan.model.gof23.structure.bridge.case2;

/**
 * 支付 -- 多种支付方式
 *
 * @author stephen
 * @date 2020/10/30 4:51 下午
 */
public abstract class Pay {

    protected Verify verify;

    public Pay(Verify verify) {
        this.verify = verify;
    }

    /**
     * 付款
     *
     * @author stephen
     * @date 2020/10/30 4:56 下午
     */
    public abstract void payment();

}
