package com.imooc.design.pattern.structural.bridge;

/**
 * @author zht
 * @date 2019/5/11 10:47
 **/
public class ABCBank extends AbstractBank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        //将具体的行为委托出去，委托给抽象父类注入的account
        account.openAccount();
        return account;
    }
}
