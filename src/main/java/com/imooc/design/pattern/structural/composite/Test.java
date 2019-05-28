package com.imooc.design.pattern.structural.composite;

/**
 * @author zht
 * @date 2019/5/10 20:47
 **/
public class Test {

    public static void main(String[] args) {

        //创建课程对象
        AbstractCatalogComponent linuxCourse = new Course("Linux课程", 11);
        AbstractCatalogComponent windowsCourse = new Course("Windows课程", 11);

        //创建java目录（二级目录）对象
        AbstractCatalogComponent javaCatalog = new CourseCatalog("Java课程", 2);

        //创建java课程对象
        AbstractCatalogComponent springbootCourse = new Course("Springboot课程", 12);
        AbstractCatalogComponent springmvcCourse = new Course("springmvc课程", 12);

        //将java课程对象添加到java课程目录中
        javaCatalog.add(springbootCourse);
        javaCatalog.add(springmvcCourse);

        //创建主目录（一级目录）对象
        AbstractCatalogComponent imoocCatalog = new CourseCatalog("慕课网主目录", 1);

        //将课程及目录添加到主目录中
        imoocCatalog.add(linuxCourse);
        imoocCatalog.add(windowsCourse);
        imoocCatalog.add(javaCatalog);

        //打印各级目录对象
        imoocCatalog.print();
    }
}
