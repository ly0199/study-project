package com.lijq.gp.pattern.factory.abs;

import com.lijq.gp.pattern.factory.Benz;

/**
 * @author Lijq
 * @time 2018/3/4 22:19
 */
public class BenzFactory {

    public Benz getBenz() {
        return new Benz();
    }
}
