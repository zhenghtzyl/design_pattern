package com.imooc.design.pattern.structural.bridge;

/**
 * @author zht
 * @date 2019/5/11 10:50
 **/
public class ICBCBank extends AbstractBank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        //将具体的行为委托出去，委托给抽象父类注入的account
        account.openAccount();
        return account;
    }
}
