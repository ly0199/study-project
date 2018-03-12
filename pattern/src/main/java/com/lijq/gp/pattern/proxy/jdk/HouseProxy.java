package com.lijq.gp.pattern.proxy.jdk;

import com.lijq.gp.pattern.proxy.IFinder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Lijq
 * @date 2018/3/10 23:30
 * @description
 */
public class HouseProxy implements InvocationHandler {

    private static Logger logger = LoggerFactory.getLogger(HouseProxy.class);

    private IFinder target;

    public Object getInstance(IFinder target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        logger.info("HouseProxy start invoke");
        Object object = method.invoke(this.target, args);
        logger.info("HouseProxy end invoke");
        return object;
    }
}
