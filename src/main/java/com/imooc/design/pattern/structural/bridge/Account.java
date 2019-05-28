package com.imooc.design.pattern.structural.bridge;

/**
 * @author zht
 * @date 2019/5/11 10:39
 **/
public interface Account {

    /**
     * 打开账号
     */
    Account openAccount();

    /**
     * 展示账号
     */
    void showAccountType();
}
