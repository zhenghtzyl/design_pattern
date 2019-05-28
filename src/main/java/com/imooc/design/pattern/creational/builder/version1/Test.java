package com.imooc.design.pattern.creational.builder.version1;

/**
 * @author zht
 * @date 2019/4/11 15:13
 **/
public class Test {

    public static void main(String[] args) {

        CourseBuilder courseBuilder = new CourseActualBuilder();

        Coach coach = new Coach();

        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("name",
                "ppt",
                "video",
                "article",
                "questionAndAnswer");

        System.out.println(course);
    }
}
