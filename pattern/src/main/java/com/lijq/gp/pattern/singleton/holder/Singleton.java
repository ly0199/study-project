package com.lijq.gp.pattern.singleton.holder;

/**
 * @author Lijq
 * @date 2018/3/8 10:49
 * @description 在外部类被调用时，内部类才会被加载，内部类一定是在方法调用之前初始化
 * 避免了线程安全问题
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }


}
