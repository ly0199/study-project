package com.lijq.gp.pattern.factory.abs.other;

import com.lijq.gp.pattern.factory.ISender;
import com.lijq.gp.pattern.factory.MailSender;

/**
 * @author Lijq
 * @date 2018/3/8 10:32
 * @description
 */
public class MailSenderFactory {

    public ISender produce() {
        return new MailSender();
    }
}
