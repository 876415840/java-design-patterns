package com.alan.model.gof23.structure.bridge.case2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 京东支付
 *
 * @author stephen
 * @date 2020/10/30 4:58 下午
 */
public class JdPay extends Pay {

    private static final Logger log = LoggerFactory.getLogger(JdPay.class);

    public JdPay(Verify verify) {
        super(verify);
    }

    @Override
    public void payment() {
        log.info("京东支付->");
        verify.security();
    }
}
