package com.alan.model.behavior.state.domain;

/**
 * @Description: 抽象状态类
 * @Author MengQingHao
 * @Date 2019/11/26 2:23 下午
 * @Version 1.0
 */
public abstract class State {

    /**
     * 状态处理
     * @param context
     */
    public abstract void handle(Context context);
}
