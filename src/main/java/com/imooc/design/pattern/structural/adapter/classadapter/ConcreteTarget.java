package com.imooc.design.pattern.structural.adapter.classadapter;

/**
 * 目标实现类
 * @author zht
 * @date 2019/4/21 21:50
 **/
public class ConcreteTarget implements Target {

    public void request() {
        System.out.println("concreTarget目标方法");
    }
}
