package com.lijq.gp.pattern.factory.abs;

import com.lijq.gp.pattern.factory.ICart;

/**
 * @author Lijq
 * @time 2018/3/4 22:18
 */
public class CartFactory extends AbstractFactory {
    @Override
    public ICart getBmw() {
        return new BmwFactory().getBmw();
    }

    @Override
    public ICart getBenz() {
        return new BenzFactory().getBenz();
    }
}
