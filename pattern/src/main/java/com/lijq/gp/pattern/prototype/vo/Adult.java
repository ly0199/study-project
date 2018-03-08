package com.lijq.gp.pattern.prototype.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lijq
 * @date 2018/3/7 23:20
 * @descript 成年人，需要实现 Cloneable, 序列化接口
 */
@Data
public class Adult extends Person implements Cloneable, Serializable {

    private List<Child> children = new ArrayList<>();
}
