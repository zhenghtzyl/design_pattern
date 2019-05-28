package com.imooc.design.pattern.structural.proxy;

/**
 * @author zht
 * @date 2019/5/12 22:08
 **/
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
