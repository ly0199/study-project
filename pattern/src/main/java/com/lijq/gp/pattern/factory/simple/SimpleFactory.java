package com.lijq.gp.pattern.factory.simple;

import com.lijq.gp.pattern.factory.Benz;
import com.lijq.gp.pattern.factory.Bmw;
import com.lijq.gp.pattern.factory.ICart;

/**
 * @author Lijq
 * @time 2018/3/4 22:05
 */
public class SimpleFactory {


    public ICart getCart(String name) {

        if ("宝马".equals(name)) {
            return new Bmw();
        } else if ("奔驰".equals(name)) {
            return new Benz();
        } else {
            return null;
        }

    }

}
