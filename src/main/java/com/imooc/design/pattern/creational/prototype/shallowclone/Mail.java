package com.imooc.design.pattern.creational.prototype.shallowclone;

import lombok.Data;

/**
 * Cloneable 使这个类实现克隆的功能
 * @author zht
 * @date 2019/4/19 16:04
 **/
@Data
public class Mail implements Cloneable {
    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail Class Constructor");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }
    /**
     * 需要实现父类的克隆方法才能实现克隆
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.print("clone mial object  ");
        return super.clone();
    }
}
