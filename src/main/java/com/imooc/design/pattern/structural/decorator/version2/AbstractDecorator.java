package com.imooc.design.pattern.structural.decorator.version2;

/**
 * 抽象装饰者类
 * @author zht
 * @date 2019/4/21 10:01
 **/
public class AbstractDecorator extends ABattercake{

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    public String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    public int cost() {
        return aBattercake.cost();
    }
}
