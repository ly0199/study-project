package com.lijq.gp.pattern.factory;

/**
 * @author Lijq
 * @date 2018/3/8 9:52
 * @description
 */
public class MailSender implements ISender {
    @Override
    public void send(String message) {
        System.out.println("MailSender:" + message);
    }
}
