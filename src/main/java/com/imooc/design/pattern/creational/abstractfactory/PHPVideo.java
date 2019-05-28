package com.imooc.design.pattern.creational.abstractfactory;

/**
 * @author zht
 * @date 2019/4/6 22:34
 **/
public class PHPVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制PHP视频");
    }
}
