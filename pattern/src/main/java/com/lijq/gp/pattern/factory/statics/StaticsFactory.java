package com.lijq.gp.pattern.factory.statics;

import com.lijq.gp.pattern.factory.ISender;
import com.lijq.gp.pattern.factory.MailSender;
import com.lijq.gp.pattern.factory.SmsSender;

/**
 * @author Lijq
 * @date 2018/3/8 10:13
 * @description
 */
public class StaticsFactory {

    public static ISender produceMail() {
        return new MailSender();
    }

    public static ISender produceSms() {
        return new SmsSender();
    }
}
