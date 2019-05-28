package com.imooc.design.pattern.structural.facade;

import lombok.Getter;

/**
 * 兑换礼物类
 * @author zht
 * @date 2019/4/20 17:48
 **/
@Getter
public class PointsGift {

    //礼物名
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }
}
