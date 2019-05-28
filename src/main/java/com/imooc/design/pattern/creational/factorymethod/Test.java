package com.imooc.design.pattern.creational.factorymethod;

/**
 * @author zht
 * @date 2019/4/6 16:27
 **/
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.getVideo();

        ArticleFactory articleFactory = new JavaArticleFactory();
        Article article = articleFactory.produce();
        article.produce();
    }
}
