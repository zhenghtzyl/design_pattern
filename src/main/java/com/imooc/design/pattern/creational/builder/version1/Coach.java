package com.imooc.design.pattern.creational.builder.version1;

import lombok.Setter;

/**
 * @author zht
 * @date 2019/4/11 15:09
 **/
@Setter
public class Coach {

    private CourseBuilder courseBuilder;

    public Course makeCourse(String courseName, String coursePPT,
                             String courseVideo, String courseArticle,
                             String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }
}
