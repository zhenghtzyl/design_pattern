package com.imooc.design.pattern.structural.decorator.version1;

/**
 * 煎饼加蛋加香肠
 * @author zht
 * @date 2019/4/21 9:43
 **/
public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc() + "加香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
