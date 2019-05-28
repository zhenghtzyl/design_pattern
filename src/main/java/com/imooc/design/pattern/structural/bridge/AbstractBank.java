package com.imooc.design.pattern.structural.bridge;

/**
 * @author zht
 * @date 2019/5/11 10:42
 **/
public abstract class AbstractBank {

    protected Account account;

    public AbstractBank(Account account ) {
        this.account = account;
    }

    abstract Account openAccount();
}
