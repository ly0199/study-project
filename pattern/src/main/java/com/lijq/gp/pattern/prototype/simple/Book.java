package com.lijq.gp.pattern.prototype.simple;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Lijq
 * @date 2018/3/8 15:01
 * @description
 */
@Getter
@Setter
public class Book implements Cloneable {

    private String name;
    private int page;
    private List<String> authors;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
