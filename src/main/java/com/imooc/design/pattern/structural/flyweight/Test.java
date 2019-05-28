package com.imooc.design.pattern.structural.flyweight;

/**
 * @author zht
 * @date 2019/4/28 15:56
 **/
public class Test {

    private final static String[] DEPARTMENTS = {"BD", "RD", "QA", "PM"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department =
                    DEPARTMENTS[(int)(Math.random() * DEPARTMENTS.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
