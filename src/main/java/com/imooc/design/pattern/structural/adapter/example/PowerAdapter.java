package com.imooc.design.pattern.structural.adapter.example;

/**
 * 适配器
 * @author zht
 * @date 2019/4/28 14:15
 **/
public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    public int outputDC5V() {
        int adapterInupt = ac220.outputAC220V();
        //变压器。。。
        int adapterOutput = adapterInupt/44;
        System.out.println("使用适配器将"
                + adapterInupt
                + "V的交流电适配成"
                + adapterOutput
                + "V的直流电");
        return adapterOutput;
    }
}
