package com.imooc.design.principle.liskovsubstitution;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zht
 * @date 2019/4/5 19:04
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(1);

        while (rectangle.getWidth() <= rectangle.getHeight()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            log.info("长方形长度为：" + rectangle.getHeight() + "宽度为：" + rectangle.getWidth());
        }

        /*Square square = new Square();
        square.setSideLength(10);

        while (square.getWidth() <= square.getHeight()) {
            square.setWidth(square.getSideLength() + 1);
            log.info("长方形长度为：" + square.getHeight() + "宽度为：" + square.getWidth());
        }*/
    }
}
