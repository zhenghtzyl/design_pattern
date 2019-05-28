package com.imooc.design.pattern.structural.facade;

/**
 * 物流子系统
 * @author zht
 * @date 2019/4/20 18:52
 **/
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        //忽略物流系统的对接逻辑

        System.out.println(pointsGift.getName() + "进入物流系统");
        //物流订单号
        String shippingOrderNum = "666666666666666666";
        return shippingOrderNum;
    }
}
