package com.lijq.gp.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Lijq
 * @date 2018/3/9 10:59
 * @description Spring中的做法，注册式单例
 */
public class BeanFactory {

    private BeanFactory() {
    }

    // ConcurrentHashMap 线程安全
    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {

        if (ioc.containsKey(className)) {
            return ioc.get(className);
        }

        Object obj = null;
        try {
            obj = Class.forName(className).newInstance();
            ioc.put(className, obj);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
