package com.lijq.gp.pattern.template;

import java.math.BigDecimal;

/**
 * @author Lijq
 * @date 2018/3/13 13:44
 * @description
 */
public class Book {

    private String name;
    private String author;
    private BigDecimal price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

