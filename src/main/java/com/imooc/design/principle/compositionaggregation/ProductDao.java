package com.imooc.design.principle.compositionaggregation;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zht
 * @date 2019/4/5 19:40
 **/
@Slf4j
@Setter
public class ProductDao {

    DBConnection dbConnection;

    public void addProudct() {
        String conn = dbConnection.getConnection();
        log.info("使用" + conn + "增加产品");
    }
}
