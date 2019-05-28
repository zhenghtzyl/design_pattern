package com.imooc.design.pattern.creational.prototype.destroysingleton;

import com.imooc.design.pattern.creational.singleton.HungrySingleton;
import com.imooc.design.pattern.creational.singleton.LazyDoubleCheckSingleton;

import java.lang.reflect.Method;

/**
 * 通过原型模式的克隆方法破坏单例
 * @author zht
 * @date 2019/4/20 11:01
 **/
public class Test {

    public static void main(String[] args) throws Exception {
        //获取HungrySingleton类
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        //通过反射获取HungrySingleton类中的clone()方法
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        //忽略method获取到的方法其访问权限的限制
        method.setAccessible(true);
        // invoke(从中调用基础方法的对象,用于方法调用的参数)
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);

        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        Method method2 = lazyDoubleCheckSingleton.getClass().getDeclaredMethod("clone");
        method2.setAccessible(true);
        LazyDoubleCheckSingleton cloneLazyDoubleCheckSingleton = (LazyDoubleCheckSingleton) method2.invoke(lazyDoubleCheckSingleton);
        System.out.println(lazyDoubleCheckSingleton);
        System.out.println(cloneLazyDoubleCheckSingleton);
    }
}
