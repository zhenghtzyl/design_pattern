package com.imooc.design.pattern.creational.builder.version1;

import lombok.Data;
import lombok.Setter;

/**
 * @author zht
 * @date 2019/4/11 14:42
 **/
@Data
public class Course {

    private String courseName;

    private String coursePPT;

    private String courseVideo;

    private String courseArticle;

    //question && answer
    private String courseQA;
}
