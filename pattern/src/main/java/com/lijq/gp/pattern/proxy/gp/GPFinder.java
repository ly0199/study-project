package com.lijq.gp.pattern.proxy.gp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @author Lijq
 * @date 2018/3/12 9:18
 * @description
 */
public class GPFinder implements GPInvocationHandler {

    private static Logger logger = LoggerFactory.getLogger(GPFinder.class);

    private IFinder target;

    public Object getInstance(IFinder target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        // 用来生成一个新的对象、依赖于字节码重组来实现
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method proxyMethod, Object[] args) throws Throwable {

        logger.info("GPFinder: 开始invoke");
        Object obj = proxyMethod.invoke(this.target, args);
        logger.info("GPFinder: end invoke");
        return obj;
    }
}
