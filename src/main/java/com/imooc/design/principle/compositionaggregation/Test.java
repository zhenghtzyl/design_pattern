package com.imooc.design.principle.compositionaggregation;

/**
 * @author zht
 * @date 2019/4/5 19:40
 **/
public class Test {

    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new OracleConnection());
        productDao.addProudct();
    }
}
