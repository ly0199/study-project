package com.lijq.gp.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Lijq
 * @date 2018/3/8 13:53
 * @description
 */
public class RegisterSingleton {

    private RegisterSingleton() {
    }

    private static final String KEY = "key";

    // private static Map<String, RegisterSingleton> map = new HashMap<>();

    private static Map<String, RegisterSingleton> register = new ConcurrentHashMap<>();

    public static RegisterSingleton getInstance() {
        if (register.get(KEY) == null) {
            register.put(KEY, new RegisterSingleton());
        }

        return register.get(KEY);
    }
}
