package com.imooc.design.pattern.structural.composite;

/**
 * 目录组件
 * @author zht
 * @date 2019/4/29 9:01
 **/
public abstract class AbstractCatalogComponent {

    /**
     * 添加课程/目录
     */
    public void add(AbstractCatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    /**
     * 删除课程/目录
     */
    public void remove(AbstractCatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    /**
     * 获取课程/目录名
     */
    public String getName(AbstractCatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    /**
     * 获取课程/目录价格
     */
    public double getPrice(AbstractCatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    /**
     * 打印课程/目录
     */
    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
}