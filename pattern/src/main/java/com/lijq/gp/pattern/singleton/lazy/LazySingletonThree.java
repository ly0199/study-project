package com.lijq.gp.pattern.singleton.lazy;

/**
 * @author Lijq
 * @date 2018/3/8 10:43
 * @description 在Java指令中创建对象和赋值操
 * 作是分开进行的，也就是说instance = new Singleton();语句是分两步执行的。但是JVM并不
 * 保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，然后直
 * 接赋值给instance成员，然后再去初始化这个Singleton实例。这样就可能出错。
 */
public class LazySingletonThree {

    private LazySingletonThree() {
    }

    private static LazySingletonThree instance = null;

    public static LazySingletonThree getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new LazySingletonThree();
                }
            }
        }
        return instance;
    }
}
