package com.imooc.design.pattern.structural.adapter.classadapter;

/**
 * 适配者
 * @author zht
 * @date 2019/4/21 21:52
 **/
public class Adapter extends Adaptee implements Target {

    public void request() {
        super.adapteeRequest();
    }
}
