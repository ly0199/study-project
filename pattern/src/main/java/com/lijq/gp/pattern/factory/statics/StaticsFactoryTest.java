package com.lijq.gp.pattern.factory.statics;

import com.lijq.gp.pattern.factory.ISender;

/**
 * @author Lijq
 * @date 2018/3/8 10:14
 * @description
 */
public class StaticsFactoryTest {

    public static void main(String[] args) {
        ISender sender = StaticsFactory.produceMail();
        sender.send("祎祎真可爱");
    }
}
