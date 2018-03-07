package com.lijq.gp.pattern.factory.abs;

import com.lijq.gp.pattern.factory.Bmw;

/**
 * @author Lijq
 * @time 2018/3/4 22:18
 */
public class BmwFactory {

    public Bmw getBmw() {
        return new Bmw();
    }
}
