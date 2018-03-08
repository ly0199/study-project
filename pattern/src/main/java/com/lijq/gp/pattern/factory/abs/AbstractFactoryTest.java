package com.lijq.gp.pattern.factory.abs;

import com.lijq.gp.pattern.factory.ISender;

/**
 * @author Lijq
 * @time 2018/3/4 22:20
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        AbstractFactory factory = new MailSenderFactory();
        ISender sender = factory.produce();
        sender.send("祎祎真漂亮");

    }
}
