package com.imooc.design.pattern.structural.decorator.version2;

/**
 * 实体类
 * @author zht
 * @date 2019/4/21 10:10
 **/
public class Battercake extends ABattercake{

    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 7;
    }
}
