package com.imooc.design.pattern.creational.prototype.deepclone;

import java.util.Date;

/**
 * @author zht
 * @date 2019/4/19 23:39
 **/
public class Test {

    public static void main(String[] args) throws Exception {
        Date birthday = new Date(0L);
        PeppaPig peppaPig1 = new PeppaPig("佩奇", birthday);
        PeppaPig peppaPig2 = (PeppaPig) peppaPig1.clone();

        System.out.println(peppaPig1);
        System.out.println(peppaPig2);

        peppaPig1.getBirthday().setTime(1555727400000L);
        System.out.println(peppaPig1);
        System.out.println(peppaPig2);
    }
}
