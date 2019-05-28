package com.imooc.design.pattern.creational.singleton;

/**
 * 懒汉式加载（同步锁）
 * @author zht
 * @date 2019/4/16 8:56
 **/
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    /**
     * 私有构造器
     */
    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
