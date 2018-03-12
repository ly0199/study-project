package com.lijq.gp.pattern.prototype.vo;

import java.io.Serializable;

/**
 * @author Lijq
 * @date 2018/3/8 15:42
 * @description
 */

public class Child implements Serializable {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
