package com.imooc.design.principle.singleresponsibility;

/**
 * @author zht
 * @date 2019/4/5 15:05
 **/
public interface ICourse {

    /**
     * 获取课程
     * @return
     */
    String getCourseName();
    byte[] getCourseVideo();

    /**
     *  管理课程
     */
    void studyCourse();
    void refundCourse();

    /**
     * 综上，属于两个职责，一个属于获取职责，一个属于管理职责，
     * 所以可以将以上接口写成两个接口（如：ICourseManager,ICourseContent）
     */
}
