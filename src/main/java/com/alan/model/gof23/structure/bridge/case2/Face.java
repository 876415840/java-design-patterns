package com.alan.model.gof23.structure.bridge.case2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 刷脸验证支付
 *
 * @author stephen
 * @date 2020/10/30 5:01 下午
 */
public class Face implements Verify {

    private static final Logger log = LoggerFactory.getLogger(Face.class);

    @Override
    public boolean security() {
        log.info("刷脸验证支付->通过验证");
        return true;
    }
}
