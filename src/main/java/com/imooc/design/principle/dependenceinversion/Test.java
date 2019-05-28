package com.imooc.design.principle.dependenceinversion;

/**
 * @author zht
 * @date 2019/4/5 10:39
 **/
public class Test {

    public static void main(String[] args) {
        Geely geely = new Geely();

        geely.setICourse(new JavaCourse());
        geely.studyImoocCourse();

        geely.setICourse(new FECourse());
        geely.studyImoocCourse();

        geely.setICourse(new PythonCourse());
        geely.studyImoocCourse();
    }

}
