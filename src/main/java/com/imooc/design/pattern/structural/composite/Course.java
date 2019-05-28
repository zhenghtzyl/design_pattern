package com.imooc.design.pattern.structural.composite;

/**
 * 课程类
 * @author zht
 * @date 2019/5/10 20:23
 **/
public class Course extends AbstractCatalogComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(AbstractCatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(AbstractCatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("name: " + name + "  price: " + price);
    }
}
