package com.imooc.design.pattern.structural.bridge;

/**
 * 活期账户类
 * @author zht
 * @date 2019/5/11 10:42
 **/
public class SavingAccount implements Account {

    public Account openAccount() {
        System.out.println("打开定期账号");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
