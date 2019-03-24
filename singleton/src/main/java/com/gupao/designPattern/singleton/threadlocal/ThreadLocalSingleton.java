package com.gupao.designPattern.singleton.threadlocal;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-21
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> ins = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return ins.get();
    }
}
