package com.imooc.design.pattern.structural.flyweight;

/**
 * @author zht
 * @date 2019/4/28 15:29
 **/
public class Manager implements Employee {

    /**
     * 部门
     */
    private String department;

    /**
     * 报告内容
     */
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public void report() {
        System.out.println(reportContent);
    }
}
