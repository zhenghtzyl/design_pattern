package com.imooc.design.principle.compositionaggregation;

/**
 * @author zht
 * @date 2019/4/5 19:58
 **/
public class OracleConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "Oracle数据连接";
    }
}
