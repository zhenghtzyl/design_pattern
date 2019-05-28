package com.imooc.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 懒汉式加载（双重检查）
 * @author zht
 * @date 2019/4/16 13:37
 **/
public class LazyDoubleCheckSingleton implements Serializable, Cloneable {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    /**
     * 私有构造器
     */
    private LazyDoubleCheckSingleton() {
        if (lazyDoubleCheckSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

    private Object readResolve() {
        return lazyDoubleCheckSingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
