package com.lijq.gp.pattern.factory.simple;

import com.lijq.gp.pattern.factory.ISender;
import com.lijq.gp.pattern.factory.MailSender;
import com.lijq.gp.pattern.factory.SmsSender;

/**
 * @author Lijq
 * @time 2018/3/4 22:05
 */
public class SimpleFactory {


    public ISender produce(String type) {

        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("type:[" + type + "] 没有对应实现");
            return null;
        }

    }

}
