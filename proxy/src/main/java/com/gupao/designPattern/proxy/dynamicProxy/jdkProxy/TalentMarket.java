package com.gupao.designPattern.proxy.dynamicProxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-22
 */
public class TalentMarket implements InvocationHandler {
    private Object target;
    public Object getInstance(Object person){
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        before();
        Object obj = method.invoke(this.target,objects);
        after();
        return obj;
    }

    private void before(){
        System.out.println("人才市场开始筛选用人单位");
    }

    private void after(){
        System.out.println("选到合适的单位，求职结束");
    }
}
