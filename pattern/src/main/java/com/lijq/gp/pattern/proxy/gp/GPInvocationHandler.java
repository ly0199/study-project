package com.lijq.gp.pattern.proxy.gp;

import java.lang.reflect.Method;

/**
 * @author Lijq
 * @date 2018/3/12 8:49
 * @description
 */
public interface GPInvocationHandler {

    public Object invoke(Object proxy, Method proxyMethod, Object[] args) throws Throwable;
}
