package com.imooc.design.pattern.structural.decorator.version2;

/**
 * @author zht
 * @date 2019/4/21 10:17
 **/
public class SausageDecorator extends AbstractDecorator{

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
