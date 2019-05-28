package com.imooc.design.pattern.structural.decorator.version1;

/**
 * @author zht
 * @date 2019/4/21 9:51
 **/
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " 售价" + battercake.cost() + "元");

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + " 售价" + battercakeWithEgg.cost() + "元");

        BattercakeWithEggSausage battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + " 售价" + battercakeWithEggSausage.cost() + "元");
    }
}
