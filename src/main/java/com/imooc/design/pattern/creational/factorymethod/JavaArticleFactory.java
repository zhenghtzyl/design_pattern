package com.imooc.design.pattern.creational.factorymethod;

/**
 * @author zht
 * @date 2019/4/7 10:40
 **/
public class JavaArticleFactory extends ArticleFactory {

    @Override
    public Article produce() {
        return new JavaArticle();
    }
}
