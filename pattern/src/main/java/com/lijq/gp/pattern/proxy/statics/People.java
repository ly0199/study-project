package com.lijq.gp.pattern.proxy.statics;

import java.math.BigDecimal;

/**
 * @author Lijq
 * @date 2018/3/10 23:02
 * @description
 */
public class People {

    private BigDecimal maxPrice;
    private BigDecimal minPrice;
    private double maxArea;
    private double minArea;

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxArea() {
        return maxArea;
    }

    public void setMaxArea(double maxArea) {
        this.maxArea = maxArea;
    }

    public double getMinArea() {
        return minArea;
    }

    public void setMinArea(double minArea) {
        this.minArea = minArea;
    }
}
