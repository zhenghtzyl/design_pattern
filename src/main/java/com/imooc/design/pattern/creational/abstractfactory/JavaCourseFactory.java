package com.imooc.design.pattern.creational.abstractfactory;

/**
 * @author zht
 * @date 2019/4/6 21:21
 **/
public class JavaCourseFactory implements CourseFactory {

    public Article article() {
        return new JavaArticle();
    }

    public Video video() {
        return new JavaVideo();
    }
}
