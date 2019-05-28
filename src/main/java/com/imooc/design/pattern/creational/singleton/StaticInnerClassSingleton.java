package com.imooc.design.pattern.creational.singleton;

/**
 * 静态内部类实现懒加载
 * @author zht
 * @date 2019/4/16 15:32
 **/
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        if(InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 静态内部类
     */
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton =
                new StaticInnerClassSingleton();

    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
