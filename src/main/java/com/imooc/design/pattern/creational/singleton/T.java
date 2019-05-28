package com.imooc.design.pattern.creational.singleton;

/**
 * @author zht
 * @date 2019/4/16 9:02
 **/
public class T implements Runnable {

    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + "  " + instance);


//        /*
//         * 容器单例
//         */
//        String key = "object";
//        ContainerSingleton.putInstance(key, new Object());
//        Object instance = ContainerSingleton.getInstance(key);
//        System.out.println(Thread.currentThread().getName() + "  " + instance);


        /*
         * 线程单例
         */
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+instance);
    }
}
