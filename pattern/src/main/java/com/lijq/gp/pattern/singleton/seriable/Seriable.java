package com.lijq.gp.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @author Lijq
 * @date 2018/3/9 11:09
 * @description 序列化时导致单例破坏
 */
public class Seriable implements Serializable {

    /**
     * 序列化就是把内存中的状态通过转换成字节码的形式，转换成一个IO流，写入到其它地方(磁盘、网络IO等)
     * 将内存中的状态永久保留下来。
     */

    /**
     * 反序列化是将已经持久化的字节码内容，转换为IO流，通过IO流的读取，进而将读取的内容转换成Java对象
     * 在转换过程中会重新创建对象new
     */

    private Seriable() {
    }

    private final static Seriable instance = new Seriable();

    public static Seriable getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }


}
