package com.lijq.gp.pattern.singleton.hungry;

/**
 * @author Lijq
 * @date 2018/3/7 22:52
 * @descript 饿汉式单例模式
 * 在类加载时立即初始化，并创建单例对象，没有加载任何锁，执行效率较高，在用户体验上比懒汉式更好
 * 但是在类加载的时候初始化，不论是否调用都会占据一定内存空间，可能会造成内存的浪费
 * <p>
 * 线程安全，在线程没有出现前就已经实例化，不存在访问安全问题
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
