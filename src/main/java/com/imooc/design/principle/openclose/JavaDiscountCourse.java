package com.imooc.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @author zht
 * @date 2019/4/5 9:42
 **/
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, BigDecimal price) {
        super(id, name, price);
    }

    public BigDecimal getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(new BigDecimal(0.8));
    }
}
