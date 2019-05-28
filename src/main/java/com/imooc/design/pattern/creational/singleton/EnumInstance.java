package com.imooc.design.pattern.creational.singleton;

/**
 * 枚举
 * @author zht
 * @date 2019/4/17 8:05
 **/
public enum  EnumInstance {
    /**
     * 枚举返回的类型
     */
    INSTANCE {
        @Override
        protected void printTest() {
            System.out.println("Geely Print Test");
        }
    };

    /**
     * 为了让外部能够访问printTest()方法
     */
    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
