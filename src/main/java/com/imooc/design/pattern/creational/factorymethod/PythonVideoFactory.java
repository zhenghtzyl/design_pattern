package com.imooc.design.pattern.creational.factorymethod;

/**
 * @author zht
 * @date 2019/4/6 19:41
 **/
public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
