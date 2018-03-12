package com.lijq.gp.pattern.proxy.statics;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Lijq
 * @date 2018/3/11 0:01
 * @description
 */
public class House implements Serializable {

    private BigDecimal price;
    private double area;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
