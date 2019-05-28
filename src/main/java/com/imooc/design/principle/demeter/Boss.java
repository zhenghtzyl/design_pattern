package com.imooc.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zht
 * @date 2019/4/5 16:15
 **/
public class Boss {

    /**
     * 模拟老板给领队下指令查询课程的数量
     * @param teamLeader
     */
    public void commandCheckCourseNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourse();
    }
}
