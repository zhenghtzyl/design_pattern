package com.imooc.design.pattern.structural.adapter.example;

/**
 * @author zht
 * @date 2019/4/28 14:19
 **/
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
