package com.imooc.design.pattern.structural.proxy;

import org.springframework.stereotype.Repository;

/**
 * @author zht
 * @date 2019/5/12 22:03
 **/
public class OrderDaoImpl implements IOrderDao {

    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
