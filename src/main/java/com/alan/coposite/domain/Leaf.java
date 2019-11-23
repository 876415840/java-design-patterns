package com.alan.coposite.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 树叶构件
 * @Author MengQingHao
 * @Date 2019/11/23 5:35 下午
 * @Version 1.0
 */
public class Leaf implements Component{

    private static final Logger LOGGER = LoggerFactory.getLogger(Leaf.class);

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        LOGGER.info("树叶构件-{}-执行操作", name);
    }
}
