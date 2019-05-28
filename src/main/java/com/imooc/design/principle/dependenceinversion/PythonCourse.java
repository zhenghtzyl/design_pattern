package com.imooc.design.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zht
 * @date 2019/4/5 10:36
 **/
@Slf4j
public class PythonCourse implements ICourse {

    public void studyCourse() {
        log.info("Geely正在学习Python课程");
    }
}
