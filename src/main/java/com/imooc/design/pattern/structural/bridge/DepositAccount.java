package com.imooc.design.pattern.structural.bridge;

/**
 * 定期账户类
 * @author zht
 * @date 2019/5/11 10:42
 **/
public class DepositAccount implements Account {

    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
