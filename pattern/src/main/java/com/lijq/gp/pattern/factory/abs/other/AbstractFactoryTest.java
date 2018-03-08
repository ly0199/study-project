package com.lijq.gp.pattern.factory.abs.other;

import com.lijq.gp.pattern.factory.ISender;

/**
 * @author Lijq
 * @date 2018/3/8 10:35
 * @description
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        ISender sender = new SenderFactory().produceMail();
        sender.send("祎祎快长大");
    }
}
