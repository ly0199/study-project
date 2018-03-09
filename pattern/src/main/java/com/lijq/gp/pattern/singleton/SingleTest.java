package com.lijq.gp.pattern.singleton;

import com.lijq.gp.pattern.singleton.holder.Singleton;
import com.lijq.gp.pattern.singleton.hungry.HungrySingleton;
import com.lijq.gp.pattern.singleton.lazy.LazySingletonOne;
import com.lijq.gp.pattern.singleton.lazy.LazySingletonTwo;
import com.lijq.gp.pattern.singleton.register.RegisterSingleton;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

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
    public void hungryTest() throws InterruptedException {
        int count = 100;
        CountDownLatch latch = new CountDownLatch(count);

        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                try {
                    // 获取实例前将线程等待
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                HungrySingleton singleton = HungrySingleton.getInstance();
                System.out.println(singleton);

            }).start();

            // 每次循环 countDownji
            latch.countDown();
        }

        System.out.println("wait......");
        latch.await(10, TimeUnit.SECONDS);
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
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LazySingletonOne singleton = LazySingletonOne.getInstance();
                //System.out.println(singleton);
                latch.countDown();
            }).start();
        }

        try {
            latch.await(10, TimeUnit.SECONDS);
            long end = System.currentTimeMillis();
            System.out.println("耗时：" + (end - start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void lazyTestTow() throws InterruptedException {
        int count = 20000;
        CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LazySingletonTwo singleton = LazySingletonTwo.getInstance();
                //System.out.println(singleton);
            }).start();
            latch.countDown();
        }

        latch.await(10, TimeUnit.SECONDS);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

    /**
     * 注册式单例
     * @throws InterruptedException
     */
    @Test
    public void registerTest() throws InterruptedException {
        int count = 200;
        CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                RegisterSingleton singleton = RegisterSingleton.getInstance();
                System.out.println(singleton);
            }).start();
            latch.countDown();
        }

        latch.await(10, TimeUnit.SECONDS);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }


    @Test
    public void testMapPut(){
        Map<String, Singleton> maps = new HashMap<>();
        System.out.println(maps.put("a", Singleton.getInstance()));
    }
}
