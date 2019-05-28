package com.imooc.design.principle.compositionaggregation;

/**
 * @author zht
 * @date 2019/4/5 19:57
 **/
public class MySQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "MySQL数据连接";
    }
}
