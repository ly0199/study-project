package com.lijq.gp.pattern.prototype.simple;

import java.util.List;

/**
 * @author Lijq
 * @date 2018/3/8 15:01
 * @description
 */
public class Book implements Cloneable {

    private String name;
    private int page;
    private List<String> authors;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
