package com.imooc.design.pattern.structural.facade;

/**
 * 外观类
 * @author zht
 * @date 2019/4/20 20:00
 **/
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift) {
        //如果资格校验通过
        if(qualifyService.isAvailable(pointsGift)) {
            //如果支付积分成功
            if (pointsPaymentService.pay(pointsGift)) {
                String shippingOrderNum = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号为：" + shippingOrderNum);
            }
        }
    }
}
