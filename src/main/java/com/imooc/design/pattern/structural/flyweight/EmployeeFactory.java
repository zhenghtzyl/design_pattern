package com.imooc.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zht
 * @date 2019/4/28 15:48
 **/
public class EmployeeFactory {
    private final static Map<String, Employee> EMPLOYEE_MAP
            = new HashMap<String, Employee>();
    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if(manager == null) {
            manager = new Manager(department);

            System.out.print("创建部门经理：" + department);

            String reportContent = department + "部门汇报：。。。";

            manager.setReportContent(reportContent);
            System.out.println(" 创建报告：" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
