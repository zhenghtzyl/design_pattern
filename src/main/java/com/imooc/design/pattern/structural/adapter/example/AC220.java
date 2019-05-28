package com.imooc.design.pattern.structural.adapter.example;

/**
 * 交流电220V
 * @author zht
 * @date 2019/4/28 14:12
 **/
public class AC220 {

    /**
     * 输出220V交流电
     */
    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }
}
