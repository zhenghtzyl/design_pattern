package com.imooc.design.principle.demeter;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zht
 * @date 2019/4/5 16:16
 **/
@Slf4j
public class TeamLeader {

    /**
     * 领导查询课程的总数目
     * @return
     */
    public void checkNumberOfCourse() {

        List<Course> courseList = new ArrayList<Course>();
        for (int i=0; i<100; i++) {
            courseList.add(new Course());
        }

        log.info("课程总数为：" + courseList.size());
    }
}
