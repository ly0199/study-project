package com.lijq.gp.pattern.factory.abs.other;

import com.lijq.gp.pattern.factory.ISender;
import com.lijq.gp.pattern.factory.SmsSender;

/**
 * @author Lijq
 * @date 2018/3/8 10:34
 * @description
 */
public class SmsSenderFactory {

    public ISender produce() {
        return new SmsSender();
    }
}
