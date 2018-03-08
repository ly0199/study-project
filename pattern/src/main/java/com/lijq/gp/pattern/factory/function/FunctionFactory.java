package com.lijq.gp.pattern.factory.function;

import com.lijq.gp.pattern.factory.MailSender;
import com.lijq.gp.pattern.factory.SmsSender;

/**
 * @author Lijq
 * @time 2018/3/4 22:12
 */
public class FunctionFactory {

    public MailSender produceMail() {
        return new MailSender();
    }

    public SmsSender produceSms() {
        return new SmsSender();
    }
}
