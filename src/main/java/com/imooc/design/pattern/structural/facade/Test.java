package com.imooc.design.pattern.structural.facade;

/**
 * @author zht
 * @date 2019/4/20 20:04
 **/
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
