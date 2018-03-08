package com.lijq.gp.pattern.singleton.lazy;

/**
 * @author Lijq
 * @date 2018/3/7 23:11
 * @descript
 */
public class LazySingletonTwo {

    private LazySingletonTwo() {
    }

    private static LazySingletonTwo INSTANCE = null;

    public static synchronized LazySingletonTwo getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingletonTwo();
        }
        return INSTANCE;
    }
}
