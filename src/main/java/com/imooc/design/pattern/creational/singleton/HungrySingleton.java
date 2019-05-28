package com.imooc.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例模式（在类加载的时候就进行初始化）
 * @author zht
 * @date 2019/4/16 16:26
 **/
public class HungrySingleton  implements Serializable,Cloneable {
    private final static HungrySingleton HUNGRYSINGLETON;

    static {
        HUNGRYSINGLETON = new HungrySingleton();
    }
    private HungrySingleton() {
        if(HUNGRYSINGLETON != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance() {
        return HUNGRYSINGLETON;
    }
    /**
     * 此方法是通过反射出来的，没有继承关系
     */
    private Object readResolve() {
        return HUNGRYSINGLETON;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
