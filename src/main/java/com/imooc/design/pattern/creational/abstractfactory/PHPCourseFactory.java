package com.imooc.design.pattern.creational.abstractfactory;

/**
 * @author zht
 * @date 2019/4/6 22:34
 **/
public class PHPCourseFactory implements CourseFactory {


    public Article article() {
        return new PHPArticle();
    }

    public Video video() {
        return new PHPVideo();
    }
}
