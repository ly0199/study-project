package com.lijq.gp.pattern.factory.abs;

import com.lijq.gp.pattern.factory.ISender;
import com.lijq.gp.pattern.factory.MailSender;

/**
 * @author Lijq
 * @date 2018/3/8 10:27
 * @description
 */
public class MailSenderFactory extends AbstractFactory {
    @Override
    public ISender produce() {
        return new MailSender();
    }
}
