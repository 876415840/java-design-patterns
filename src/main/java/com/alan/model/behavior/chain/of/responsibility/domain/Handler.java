package com.alan.model.behavior.chain.of.responsibility.domain;

/**
 * @Description: 抽象处理者角色
 * @Author MengQingHao
 * @Date 2019/11/26 12:22 下午
 * @Version 1.0
 */
public abstract class Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    /**
     * 处理请求的方法
     * @param request
     */
    public abstract void handleRequest(String request);
}
