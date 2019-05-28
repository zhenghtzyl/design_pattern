package com.imooc.design.pattern.creational.builder.version1;

/**
 * @author zht
 * @date 2019/4/11 14:46
 **/
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
