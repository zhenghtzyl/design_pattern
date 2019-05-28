package com.imooc.design.pattern.structural.adapter.classadapter;

/**
 * @author zht
 * @date 2019/4/22 8:29
 **/
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
