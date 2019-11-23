package com.alan.coposite.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * @Description: 树枝构件
 * @Author MengQingHao
 * @Date 2019/11/23 5:37 下午
 * @Version 1.0
 */
public class Composite implements Component {

    private static final Logger LOGGER = LoggerFactory.getLogger(Composite.class);

    private ArrayList<Component> children=new ArrayList<Component>();

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        LOGGER.info("树枝构件-{}-执行操作", name);
        for (Component child : children) {
            child.operation();
        }
    }
}
