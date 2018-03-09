package com.lijq.gp.pattern.singleton.lazy;

/**
 * @author Lijq
 * @date 2018/3/7 23:11
 * @descript
 */
public class LazySingletonTwo {

    private LazySingletonTwo() {
    }

    private static LazySingletonTwo instance = null;

    // 同步锁
    public static synchronized LazySingletonTwo getInstance() {
        if (instance == null) {
            instance = new LazySingletonTwo();
        }
        return instance;
    }
}
