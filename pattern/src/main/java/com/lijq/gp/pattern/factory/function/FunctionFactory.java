package com.lijq.gp.pattern.factory.function;

import com.lijq.gp.pattern.factory.Benz;
import com.lijq.gp.pattern.factory.Bmw;
import com.lijq.gp.pattern.factory.ICart;

/**
 * @author Lijq
 * @time 2018/3/4 22:12
 */
public class FunctionFactory {

    public ICart getBmw() {
        return new Bmw();
    }

    public ICart getBenz() {
        return new Benz();
    }

}
