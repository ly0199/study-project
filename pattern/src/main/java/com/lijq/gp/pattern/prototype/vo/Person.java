package com.lijq.gp.pattern.prototype.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Lijq
 * @date 2018/3/7 23:18
 * @descript 必须实现Cloneable, 序列化接口
 */
@Data
public class Person implements Cloneable, Serializable {

    private String name;
    private int age;
}
