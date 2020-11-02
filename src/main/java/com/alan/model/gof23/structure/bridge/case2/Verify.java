package com.alan.model.gof23.structure.bridge.case2;

/**
 * 验证支付 - 不同的验证方式
 *
 * @author stephen
 * @date 2020/10/30 4:54 下午
 */
public interface Verify {

    /**
     * @return 安全校验
     */
    boolean security();
}
