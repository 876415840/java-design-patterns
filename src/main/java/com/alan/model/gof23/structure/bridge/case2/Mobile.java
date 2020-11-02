package com.alan.model.gof23.structure.bridge.case2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 手机验证码验证支付
 *
 * @author stephen
 * @date 2020/10/30 5:01 下午
 */
public class Mobile implements Verify {

    private static final Logger log = LoggerFactory.getLogger(Mobile.class);

    @Override
    public boolean security() {
        log.info("手机验证码验证支付->通过验证");
        return true;
    }
}
