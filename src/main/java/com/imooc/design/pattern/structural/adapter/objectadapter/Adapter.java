package com.imooc.design.pattern.structural.adapter.objectadapter;

/**
 * 适配器类
 * @author zht
 * @date 2019/4/22 9:12
 **/
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.adapteeRequest();
    }
}
