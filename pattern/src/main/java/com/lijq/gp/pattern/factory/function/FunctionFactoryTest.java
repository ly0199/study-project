package com.lijq.gp.pattern.factory.function;

import com.lijq.gp.pattern.factory.MailSender;

/**
 * @author Lijq
 * @time 2018/3/4 22:16
 */
public class FunctionFactoryTest {

    public static void main(String[] args) {

        FunctionFactory functionFactory = new FunctionFactory();
        MailSender mailSender = functionFactory.produceMail();
        mailSender.send("祎祎是最棒的宝贝");

    }
}
