package com.imooc.design.pattern.creational.prototype.deepclone;

import lombok.Data;

import java.util.Date;

/**
 * @author zht
 * @date 2019/4/19 23:35
 **/
@Data
public class PeppaPig implements Cloneable {

    private String name;
    private Date birthday;

    public PeppaPig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "PeppaPig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PeppaPig peppaPig = (PeppaPig) super.clone();

        //深克隆
        peppaPig.birthday = (Date) peppaPig.birthday.clone();

        return peppaPig;
    }
}
