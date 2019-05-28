package com.imooc.design.pattern.creational.factorymethod;

/**
 * @author zht
 * @date 2019/4/7 10:39
 **/
public class PythonArticle extends Article {

    @Override
    public void produce() {
        System.out.println("Python手记编写");
    }
}
