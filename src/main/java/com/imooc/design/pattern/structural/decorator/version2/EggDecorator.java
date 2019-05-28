package com.imooc.design.pattern.structural.decorator.version2;

/**
 * @author zht
 * @date 2019/4/21 10:14
 **/
public class EggDecorator extends AbstractDecorator{

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
