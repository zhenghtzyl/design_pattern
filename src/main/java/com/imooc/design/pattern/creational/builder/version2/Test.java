package com.imooc.design.pattern.creational.builder.version2;

/**
 * @author zht
 * @date 2019/4/15 8:29
 **/
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .builderCourseName("name")
                .buildCoursePPT("ppt")
                .build();
        System.out.println(course);

    }
}
