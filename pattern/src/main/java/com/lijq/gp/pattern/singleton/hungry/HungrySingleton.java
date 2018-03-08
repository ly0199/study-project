package com.lijq.gp.pattern.singleton.hungry;

/**
 * @author Lijq
 * @date 2018/3/7 22:52
 * @descript
 */
public class HungrySingleton {

    /**
     * 私有化构造方法
     */
    private HungrySingleton() {
    }

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
