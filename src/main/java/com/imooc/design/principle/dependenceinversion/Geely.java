package com.imooc.design.principle.dependenceinversion;

import lombok.Setter;

/**
 * @author zht
 * @date 2019/4/5 10:35
 **/
@Setter
public class Geely {

    private ICourse iCourse;

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
