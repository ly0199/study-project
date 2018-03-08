package com.lijq.gp.pattern.factory.abs.other;

import com.lijq.gp.pattern.factory.ISender;

/**
 * @author Lijq
 * @date 2018/3/8 10:31
 * @description
 */
public class SenderFactory extends AbstractFactory {
    @Override
    public ISender produceMail() {
        return new MailSenderFactory().produce();
    }

    @Override
    public ISender produceSms() {
        return new SmsSenderFactory().produce();
    }
}
