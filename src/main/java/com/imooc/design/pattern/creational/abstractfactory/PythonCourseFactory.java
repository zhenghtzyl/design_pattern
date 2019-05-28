package com.imooc.design.pattern.creational.abstractfactory;

/**
 * @author zht
 * @date 2019/4/6 21:21
 **/
public class PythonCourseFactory implements CourseFactory {

    public Article article() {
        return new PythonArticle();
    }

    public Video video() {
        return new PythonVideo();
    }
}
