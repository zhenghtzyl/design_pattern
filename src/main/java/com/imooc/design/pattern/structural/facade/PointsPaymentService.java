package com.imooc.design.pattern.structural.facade;

/**
 * 积分支付子系统
 * @author zht
 * @date 2019/4/20 18:50
 **/
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        //忽略支付系统逻辑
        System.out.println("支付" + pointsGift.getName() + " 扣除积分成功");
        return true;
    }
}
