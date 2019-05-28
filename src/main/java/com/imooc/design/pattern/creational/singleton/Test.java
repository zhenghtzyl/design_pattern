package com.imooc.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author zht
 * @date 2019/4/16 9:00
 **/
public class Test {

    public static void main(String[] args) throws Exception {
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("end");


//        /*
//         * 双重检查序列化破坏单例测试
//         */
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        LazyDoubleCheckSingleton newInstance = (LazyDoubleCheckSingleton) ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);


//        /*
//         * 饿汉式反射攻击测试
//         */
//        Class objectClass = HungrySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        //修改构造器权限
//        constructor.setAccessible(true);
//        //通过单例获取对象
//        HungrySingleton instance = HungrySingleton.getInstance();
//        //通过构造器获取对象
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);


//        /*
//         * 静态内部类反射攻击测试
//         */
//        Class objectClass = StaticInnerClassSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        //修改构造器权限
//        constructor.setAccessible(true);
//        //通过单例获取对象
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        //通过构造器获取对象
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();


//        /*
//         * 懒汉式反射攻击测试
//         */
//        Class objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        //修改构造器权限
//        constructor.setAccessible(true);
//
//        //通过单例获取对象
//        LazySingleton instance = LazySingleton.getInstance();
//        //通过构造器获取对象
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);


//        /*
//         *  通过枚举测试序列化与反序列化能否破坏单例（结果：枚举类对于序列化的破坏是不受影响的）
//         */
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());


//        /*
////         * 枚举测试能否通过反射攻击单例（结果：无法对枚举类进行反射攻击)
////         */
////        Class objectClass = EnumInstance.class;
////        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
////        //修改构造器权限
////        constructor.setAccessible(true);
////        //通过单例获取对象
////        EnumInstance instance = EnumInstance.getInstance();
////        //通过构造器获取对象
////        EnumInstance newInstance = (EnumInstance) constructor.newInstance("Geely", 666);
////        System.out.println(instance);
////        System.out.println(newInstance);
////        System.out.println(instance == newInstance);

//        /*
//         *  测试枚举类中的方法
//         */
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();


//        /*
//         * 容器单例测试
//         */
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("end");


        /*
         * 线程单例测试
         */
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}
