package com.lijq.gp.pattern.factory;

/**
 * @author Lijq
 * @date 2018/3/8 9:53
 * @description
 */
public class SmsSender implements ISender {
    @Override
    public void send(String message) {
        System.out.println("SmsSender:" + message);
    }
}
