package com.gupao.designPattern.proxy.dynamicProxy.gpProxy;

import java.lang.reflect.Method;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-25
 */
public interface GPInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
