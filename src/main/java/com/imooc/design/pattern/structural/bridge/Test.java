package com.imooc.design.pattern.structural.bridge;

/**
 * @author zht
 * @date 2019/5/11 11:28
 **/
public class Test {

    public static void main(String[] args) {
        AbstractBank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        AbstractBank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        AbstractBank abcBank = new ABCBank(new DepositAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
