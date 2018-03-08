package com.lijq.gp.pattern.factory.abs.other;

import com.lijq.gp.pattern.factory.ISender;

/**
 * @author Lijq
 * @date 2018/3/8 10:30
 * @description
 */
public abstract class AbstractFactory {

    public abstract ISender produceMail();

    public abstract ISender produceSms();
}
