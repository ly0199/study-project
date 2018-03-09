package com.lijq.gp.pattern.singleton.lazy;

/**
 * @author Lijq
 * @date 2018/3/7 23:06
 * @descript
 *  懒汉式单例模式
 *      线程不安全
 */
public class LazySingletonOne {

    private LazySingletonOne() {
    }

    // 静态块，公共内存区域
    private static LazySingletonOne instance = null;

    public static LazySingletonOne getInstance() {
        if (instance == null) {
            instance = new LazySingletonOne();
        }
        return instance;
    }


    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
//    public Object readResolve() {
//        return instance;
//    }

}
