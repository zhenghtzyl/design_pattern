package com.imooc.design.pattern.creational.abstractfactory;

/**
 * @author zht
 * @date 2019/4/6 21:16
 **/
public class PythonVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
