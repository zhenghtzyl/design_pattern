package com.imooc.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;
import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例类
 * @author zht
 * @date 2019/4/17 10:55
 **/
public class ContainerSingleton {

    private ContainerSingleton() {

    }
    /**
     * HashMap是线程不安全的，如果需要线程安全的可以使用HashTable，
     * 但是HashTable每次存取都会加上同步锁，性能损耗比较严重。
     * 但如果使用HashMap，在类初始化的时候，就把此map初始化完成，
     * 即把所有的单例对象都生成完，放入map中，使用的时候直接调用，也是可行的。
     */
    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    /**
     *  在singletonMap中放入key
     */
    public static void putInstance(String key, Object instance) {
        //isNotBlank(str) 等价于 str != null && str.length > 0 && str.trim().length > 0
        //StringUtils.isNotBlank导入的jar包：org.apache.commons.lang3.StringUtils;
        if (StringUtils.isNotBlank(key) && instance != null) {
            //只有singletonMap不包含key的时候，才将key放入容器中，保证key的合法性和唯一性
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }
    /**
     * 适合在程序初始化的时候，就把多个对象放入到singletonMap中，进行统一管理
     * 使用时，通过key，直接从singletonMap中获取单例对象
     */
    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
