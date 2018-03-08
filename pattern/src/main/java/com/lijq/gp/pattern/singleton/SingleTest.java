package com.lijq.gp.pattern.singleton;

import com.lijq.gp.pattern.singleton.hungry.HungrySingleton;
import com.lijq.gp.pattern.singleton.lazy.LazySingletonOne;
import com.lijq.gp.pattern.singleton.lazy.LazySingletonTwo;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * @author Lijq
 * @date 2018/3/7 22:50
 * @descript
 */
public class SingleTest {


    /**
     * 线程安全
     */
    @Test
    public void hungryTest() {
        int count = 100;
        CountDownLatch latch = new CountDownLatch(count);

        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                HungrySingleton singleton = HungrySingleton.getInstance();
                System.out.println(singleton);
                latch.countDown();
            }).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * 线程不安全
     */
    @Test
    public void lazyTestOne() {
        long start = System.currentTimeMillis();
        int count = 20000;
        CountDownLatch latch = new CountDownLatch(count);

        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                LazySingletonOne singleton = LazySingletonOne.getInstance();
                //System.out.println(singleton);
                latch.countDown();
            }).start();
        }

        try {
            latch.await();
            long end = System.currentTimeMillis();
            System.out.println("耗时：" + (end - start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void lazyTestTow() {
        // 增大 count 可以明显看出 方法块上 加 sync 造成的代码效率影响
        int count = 20000;
        CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                LazySingletonTwo singleton = LazySingletonTwo.getInstance();
                //System.out.println(singleton);
                latch.countDown();
            }).start();
        }

        try {
            latch.await();
            long end = System.currentTimeMillis();
            System.out.println("耗时：" + (end - start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
