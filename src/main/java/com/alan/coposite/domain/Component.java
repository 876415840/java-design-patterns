package com.alan.coposite.domain;

/**
 * @Description: 抽象构件
 * @Author MengQingHao
 * @Date 2019/11/23 5:34 下午
 * @Version 1.0
 */
public interface Component {

    /**
     * 添加
     * @param c
     */
    void add(Component c);

    /**
     * 删除
     * @param c
     */
    void remove(Component c);

    /**
     * 获取子对象
     * @param i
     * @return
     */
    Component getChild(int i);

    /**
     * 操作
     */
    void operation();
}
