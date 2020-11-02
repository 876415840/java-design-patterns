package com.alan.model.gof23.structure.bridge.case2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 指纹验证支付
 *
 * @author stephen
 * @date 2020/10/30 5:01 下午
 */
public class Finger implements Verify {

    private static final Logger log = LoggerFactory.getLogger(Finger.class);

    @Override
    public boolean security() {
        log.info("指纹验证支付->通过验证");
        return true;
    }
}
