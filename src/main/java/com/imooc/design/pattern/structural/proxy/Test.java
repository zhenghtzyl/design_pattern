package com.imooc.design.pattern.structural.proxy;

import com.imooc.design.pattern.structural.proxy.dynamicproxy.OrderServiceDynamicProxy;
import com.imooc.design.pattern.structural.proxy.staticproxy.OrderServiceStaticProxy;

/**
 * @author zht
 * @date 2019/5/12 22:33
 **/
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        /*静态代理*/
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);

        /*动态代理*/
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
