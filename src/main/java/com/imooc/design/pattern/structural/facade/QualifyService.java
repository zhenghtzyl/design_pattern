package com.imooc.design.pattern.structural.facade;

/**
 * 积分校验子系统
 * @author zht
 * @date 2019/4/20 17:50
 **/
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        //忽略校验系统逻辑
        System.out.println("校验" + pointsGift.getName() + " 积分资格校验通过,库存通过");
        return true;
    }
}
