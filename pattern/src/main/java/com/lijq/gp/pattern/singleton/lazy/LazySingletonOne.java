package com.lijq.gp.pattern.singleton.lazy;

/**
 * @author Lijq
 * @date 2018/3/7 23:06
 * @descript
 */
public class LazySingletonOne {

    private LazySingletonOne() {
    }

    private static LazySingletonOne INSTANCE = null;

    public static LazySingletonOne getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingletonOne();
        }
        return INSTANCE;
    }


}
