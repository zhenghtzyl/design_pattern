package com.imooc.design.principle.openclose;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author zht
 * @date 2019/4/5 9:02
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse
                (96,"Java从零到企业级电商开发", new BigDecimal(388));
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        log.info("课程ID：" + javaCourse.getId()
                + " 课程名称：" + javaCourse.getName()
                + " 课程原价：" + javaCourse.getOriginPrice()
                + " 课程价格：" + javaCourse.getPrice());
    }
}
