package com.lijq.gp.pattern.factory.abs;


import com.lijq.gp.pattern.factory.ICart;

/**
 * @author Lijq
 * @time 2018/3/4 22:17
 */
public abstract class AbstractFactory {

    public abstract ICart getBmw();

    public abstract ICart getBenz();

}
