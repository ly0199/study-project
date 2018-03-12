package com.lijq.gp.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @author Lijq
 * @date 2018/3/11 0:29
 * @description
 */
public class CglibProxy implements MethodInterceptor {

    private static Logger logger = LoggerFactory.getLogger(CglibProxy.class);

    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        // 设置要生成新类的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        logger.info("CglibProxy start intercept");
        Object obj = methodProxy.invokeSuper(o, objects);
        methodProxy.invokeSuper(o, objects);
        logger.info("CglibProxy end intercept");
        return obj;
    }
}
