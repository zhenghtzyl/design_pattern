package com.imooc.design.pattern.creational.factorymethod;

/**
 * @author zht
 * @date 2019/4/7 10:39
 **/
public class JavaArticle extends Article {

    @Override
    public void produce() {
        System.out.println("java手记编写");
    }
}