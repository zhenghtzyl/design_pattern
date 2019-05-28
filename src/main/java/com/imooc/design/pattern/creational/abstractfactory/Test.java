package com.imooc.design.pattern.creational.abstractfactory;

/**
 * @author zht
 * @date 2019/4/6 21:19
 **/
public class Test {

    public static void main(String[] args) {

        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.article();
        Video video = courseFactory.video();

        article.article();
        video.produce();

        CourseFactory courseFactory2 = new PHPCourseFactory();
        Article article2 = courseFactory2.article();
        Video video2 = courseFactory2.video();

        article2.article();
        video2.produce();
    }
}
