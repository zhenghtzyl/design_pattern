package com.imooc.design.principle.demeter;

/**
 * @author zht
 * @date 2019/4/5 16:16
 **/
public class Test {

    public static void main(String[] args) {

        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();

        boss.commandCheckCourseNumber(teamLeader);

    }
}
