package com.alan.proxy.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 代理类：通过代理类调用真实主题请求方法
 * @Author MengQingHao
 * @Date 2019/11/8 2:33 下午
 * @Version 1.0
 */
public class Proxy implements Subject {

    private static final Logger LOGGER = LoggerFactory.getLogger(Proxy.class);
    private RealSubject realSubject;
    @Override
    public void request() {
        if (realSubject==null)
        {
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest() {
        LOGGER.info("访问真实主题之前的预处理。");
    }
    public void postRequest() {
        LOGGER.info("访问真实主题之后的后续处理。");
    }
}
