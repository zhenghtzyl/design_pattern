package com.imooc.design.pattern.creational.abstractfactory;

/**
 * @author zht
 * @date 2019/4/6 21:20
 **/
public interface CourseFactory {

    Article article();

    Video video();
}
