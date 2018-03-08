package com.lijq.gp.pattern.prototype.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Lijq
 * @date 2018/3/8 15:42
 * @description
 */
@Getter
@Setter
public class Child implements Serializable{

    private String name;
    private int age;
}
