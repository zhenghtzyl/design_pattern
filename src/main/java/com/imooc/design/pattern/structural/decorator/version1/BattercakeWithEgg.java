package com.imooc.design.pattern.structural.decorator.version1;

/**
 * 煎饼加蛋
 * @author zht
 * @date 2019/4/21 9:42
 **/
public class BattercakeWithEgg extends Battercake{
    @Override
    public String getDesc() {
        return super.getDesc() + "加蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
