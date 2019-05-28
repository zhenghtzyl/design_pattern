package com.imooc.design.pattern.structural.decorator.version2;

/**
 * @author zht
 * @date 2019/4/21 10:15
 **/
public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + " 售价" + aBattercake.cost() + "元");
    }
}
