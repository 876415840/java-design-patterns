package com.alan.model.gof23.structure.bridge.case2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 支付宝支付
 *
 * @author stephen
 * @date 2020/10/30 4:58 下午
 */
public class AliPay extends Pay {

    private static final Logger log = LoggerFactory.getLogger(AliPay.class);

    public AliPay(Verify verify) {
        super(verify);
    }

    @Override
    public void payment() {
        log.info("支付宝支付->");
        verify.security();
    }
}
