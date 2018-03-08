package com.lijq.gp.pattern.factory.simple;

import com.lijq.gp.pattern.factory.ISender;

/**
 * @author Lijq
 * @time 2018/3/4 22:09
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();
        ISender sender = simpleFactory.produce("a");
        sender.send("祎祎是最可爱的小宝贝");

        /*System.out.println(new SimpleFactory().produce("mail"));*/

    }
}
